public class Main {
    public static void main(String[] args) {
        Streaming streaming = new Streaming();
        Film film = new Film("Film1", 1979, 10);
        Film film2 = new Film("Film2", 1999, 8);
        Film film3 = new Film("Film3", 2000, 9);
        Series series = new Series("First Series", 1980, 7, 10);
        Series series2 = new Series("Second Series", 1992, 8, 5);
        Series series3 = new Series("Third Series", 2000, 9, 25);

        streaming.addMedia(film);
        streaming.addMedia(film2);
        streaming.addMedia(film3);
        streaming.addMedia(series);
        streaming.addMedia(series2);
        streaming.addMedia(series3);

        streaming.count();
        System.out.println();

        streaming.displayAllFilms();
        System.out.println();


        Film oldestFilm = streaming.getOldestFilm();
        oldestFilm.showInfo();
        System.out.println();

        streaming.displayAllSeries();


    }
}