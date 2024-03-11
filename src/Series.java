public class Series extends Media {
    int rating;
    int amountOfEpisodes;

    public Series(String title, int year, int rating, int amountOfEpisodes) {
        super(title, year);
        this.rating = rating;
        this.amountOfEpisodes = amountOfEpisodes;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Рейтинг: " + rating);
        System.out.println("Количество серий: " + amountOfEpisodes);
    }
}