package model;

import Data.SongData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RadioStation {

    public RadioStation() {
    }
    public Set <Song> songs = (SongData.getSongsData());

    public Set<Song> getSongs() {
        return songs;
    }

    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }

    public List<Song> getSimilar(String songTitle) {

        Map<Song, Double> weightsMap = new HashMap<>();
        Song s2;
        Map<String, Song> mapTitle = songs.stream().collect(Collectors.toMap(Song::getTitle, e -> e));
        // Transforming input
        songTitle = songTitle.substring(0,1).toUpperCase() + songTitle.substring(1).toLowerCase();
        if (mapTitle.containsKey(songTitle)){
            s2 =  mapTitle.get(songTitle);
            this.songs.forEach(song -> weightsMap.put(song, distance(song,s2)));
        } else {
            System.out.println("Track not included , try another");
        }
        return weightsMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
    protected double distance(Song s1, Song s2) {

        double diff_square_sum = 0d;
        for (var entry : s1.getWeights().entrySet()){
            for (var entryk : s2.getWeights().entrySet()){
                if (entry.getKey() == entryk.getKey()){
                    diff_square_sum += Math.pow((entry.getValue()) - (entryk.getValue()),2);
                }}
        }
        return Math.sqrt(diff_square_sum);

    }
    public void printSimilar(List<Song> songs){
        songs.stream().map(Song::toString).forEach(System.out::println);
    }

}


