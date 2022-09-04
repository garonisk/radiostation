package data;
import model.Song;

import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class SongData {
    public static Set<Song> getSongsData(){
        return
                Stream.of(
                        new Song("Wonderwall", "Oasis", new HashMap<>(){{
                            put("ROCK", 90d);
                            put("POP", 10d);
                        }}),
                        new Song("Don't look back in anger", "Oasis", new HashMap<>(){{
                            put("ROCK", 80d);
                            put("BLUES", 20d);
                        }}),
                        new Song("Money", "Pink Floyd", new HashMap<>(){{
                            put("ROCK", 50d);
                            put("POP", 20d);
                            put("BLUES", 10d);
                            put("DISCO", 20d);
                        }}),
                        new Song("Catholic girl", "Frank Zappa", new HashMap<>(){{
                            put("ROCK", 30d);
                            put("POP", 10d);
                            put("BLUES", 30d);
                            put("SOUL", 30d);
                        }}),
                        new Song("Stairway to heaven", "Led Zeppelin", new HashMap<>(){{
                            put("ROCK", 80d);
                            put("BLUES", 20d);
                        }}),
                        new Song("Perfect strangers", "Deep Purple", new HashMap<>(){{
                            put("ROCK", 100d);
                        }}),
                        new Song("Purple rain", "Prince", new HashMap<>(){{
                            put("ROCK", 10d);
                            put("POP", 80d);
                            put("BLUES", 10d);
                        }}),
                        new Song("Back in black", "AC DC", new HashMap<>(){{
                            put("ROCK", 100d);
                        }}),
                        new Song("The thrill is gone", "BB King", new HashMap<>(){{
                            put("BLUES", 100d);
                        }}),
                        new Song("I would rather go blind", "Etta James", new HashMap<>(){{
                            put("BLUES", 60d);
                            put("SOUL", 40d);
                        }}),
                        new Song("With or without you", "U2", new HashMap<>(){{
                            put("ROCK", 40d);
                            put("POP", 20d);
                            put("BLUES", 40d);
                        }}),
                        new Song("Heroes", "David Bowie", new HashMap<>(){{
                            put("ROCK", 40d);
                            put("POP", 10d);
                            put("BLUES", 30d);
                            put("SOUL", 10d);
                            put("DISCO", 10d);
                        }}),
                        new Song("Free bird", "Lynyrd Skynyrd", new HashMap<>(){{
                            put("ROCK", 90d);
                            put("BLUES", 10d);
                        }}),
                        new Song("Always", "Bon Jovi", new HashMap<>(){{
                            put("ROCK", 50d);
                            put("POP", 30d);
                            put("BLUES", 20d);
                        }}),
                        new Song("Happy when it rains", "The Jesus and Mary Chain", new HashMap<>(){{
                            put("ROCK", 40d);
                            put("POP", 60d);
                        }})
                ).collect(Collectors.toSet());
    }
}
