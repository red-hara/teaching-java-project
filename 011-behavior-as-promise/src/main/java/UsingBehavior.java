public class UsingBehavior {
    public static void main(String[] args) {
        Compare compare;
        int first = 3;
        int second = 5;

        compare = new Good();
        System.out.println("Maximum value of " + first + " and " + second + " is (Good):");
        System.out.println(compare.maximum(first, second));

        compare = new Bad();
        System.out.println("Maximum value of " + first + " and " + second + " is (Bad):");
        System.out.println(compare.maximum(first, second));

        compare = new Ugly();
        System.out.println("Maximum value of " + first + " and " + second + " is (Ugly):");
        System.out.println(compare.maximum(first, second));
    }
}