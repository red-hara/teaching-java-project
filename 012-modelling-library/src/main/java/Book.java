public class Book {
    public String title;
    public String author;
    public int pageCount;
    public HSV coverColor;
    public int year;

    public void printData() {
        System.out.println("*~~~*");
        System.out.println(this.title);
        System.out.println(" by");
        System.out.println(this.author);
        System.out.println(" " + this.year);
        System.out.println("*~~~*");
    }
}