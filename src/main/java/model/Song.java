package model;

import java.util.Map;

public class Song {
    private String title;
    private String artist ;
    Map<String, Double> weights;
    final int SUM_OF_WEIGHTS = 100;
    public Song(String title, String artist, Map<String,Double> weights) {
        // Calculate sum for weights
        Double sum = getWeightsSum(weights);
        if (sum == SUM_OF_WEIGHTS){
            this.title = title;
            this.artist = artist;
            genresInit(weights);
        }else {
            throw new IllegalStateException("Provide proper numbers for weight");
        }}
    public String getArtist() {
        return this.artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Map<String,Double> getWeights() {
        return this.weights;
    }
    public void setWeights(Map<String,Double> weights) {
        this.weights = weights;
    }
    public void genresInit(Map<String, Double> weights){
        weights.putIfAbsent("ROCK", 0d);
        weights.putIfAbsent("POP", 0d);
        weights.putIfAbsent("BLUES", 0d);
        weights.putIfAbsent("SOUL", 0d);
        weights.putIfAbsent("DISCO", 0d);
        weights.putIfAbsent("HIPHOP", 0d);
        this.weights = weights;
    }
    private double getWeightsSum(Map<String,Double> weights){
        return weights.values().stream().mapToDouble(d -> d).sum();
    }
    @Override
    public String toString() {
        return getArtist() + " - " +
                getTitle();
    }

}













