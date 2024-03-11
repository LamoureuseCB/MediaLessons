public class Media {
    String title;
    int year;

    public Media(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public void showInfo(){
        System.out.println("Название: " + title);
        System.out.println("Год выпуска: " + year);
    }

}
