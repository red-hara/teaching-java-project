public class Library {
    public static void main(String[] args) {
        Book lor;
        lor = new Book();
        lor.title = "The Lord of the Rings";
        lor.author = "J. R. R. Tolkien";
        lor.pageCount = 1137;
        lor.year = 1954;
        lor.coverColor = new HSV();
        lor.coverColor.hue = 0.66f;
        lor.coverColor.saturation = 0.3f;
        lor.coverColor.value = 0.9f;

        lor.printData();
    }
}