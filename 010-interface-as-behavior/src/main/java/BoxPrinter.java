public class BoxPrinter implements FancyPrinter {
    public void print(String data) {
        int length = data.length();
        String line = "+" + "-".repeat(length) + "+";

        System.out.println(line);
        System.out.println("|" + data + "|");
        System.out.println(line);
    }
}
