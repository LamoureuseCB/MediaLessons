
import java.util.Random;

public class Streaming {
    Media[] contents;
    Random random = new Random();

    public Streaming() {
        contents = new Media[10];

    }

    public void addMedia(Media media) {
        for (int i = 0; i < contents.length; i++) {
            if (contents[i] == null) {
                contents[i] = media;
                break;
            }
        }
    }

    public void count() {
        int countFilm = 0;
        int countSeries = 0;
        for (Media media : contents) {
            if (media != null) {
                if (media instanceof Film) {
                    countFilm++;
                } else if (media instanceof Series) {
                    countSeries++;
                }
            }
        }
        System.out.println("Количество фильмов: " + countFilm);
        System.out.println("Количество сериалов: " + countSeries);
    }

    public Series getRandomSeries() {
        while (true) {
            int rIndex = random.nextInt(contents.length);
            Media media = contents[rIndex];
            if (media instanceof Series) {
                return (Series) media;
            }
        }
    }


    void displayAll() {
        for (Media media : contents) {
            System.out.println(media);
        }
    }

    void displayAllFilms() {
        System.out.println("Все фильмы:");
        for (Media media : contents) {
            if (media instanceof Film) {
                System.out.println(media.title);
            }
        }
    }

    void displayAllSeries() {
        System.out.println("Все сериалы:");
        for (Media media : contents) {
            if (media instanceof Series) {
                System.out.println(media.title);
            }

        }

    }


    public Film getOldestFilm() {
        Film oldestFilm = null;
        int oldestYear = 2024;

        System.out.println("Самый старый фильм: ");
        for (Media media : contents) {
            if (media instanceof Film && media.year < oldestYear) {
                oldestFilm = (Film) media;
                oldestYear = media.year;
            }
        }

        if (oldestFilm == null) {
            System.out.println("Фильмы не найдены.");
        }

        return oldestFilm;
    }

}


