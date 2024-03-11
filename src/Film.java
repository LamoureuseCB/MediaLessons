public class Film extends Media{
    int rating;


    public Film(String title, int year,int rating) {
        super(title, year);
        this.rating = rating;
    }


    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Рейтинг: " + rating);
    }
}
