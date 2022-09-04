import model.RadioStation;
import model.Song;

import java.util.List;

class Main {
    public static void main(String[] args) {
        RadioStation radio = new RadioStation();
        List<Song> playlist1 = radio.getSimilar("wonderdsdawall");
        radio.printSimilar(playlist1);
        List<Song> playlist2 = radio.getSimilar("wonderwall");
        radio.printSimilar(playlist2);
    }
}