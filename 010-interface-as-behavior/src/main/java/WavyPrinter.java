public class WavyPrinter implements FancyPrinter {
    public void print(String data) {
        int length = data.length();
        String wave = "~".repeat(length + 2);

        System.out.println(wave);
        System.out.println(" " + data);
        System.out.println(wave);
    }
}
