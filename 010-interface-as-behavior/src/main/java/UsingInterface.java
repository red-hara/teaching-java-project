public class UsingInterface {
    public static void main(String[] args) {
        FancyPrinter printer;

        printer = new WavyPrinter();
        printer.print("Hello World!");

        printer = new BoxPrinter();
        printer.print("Quite important message!");
    }
}
