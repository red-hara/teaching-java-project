public class Bad implements Compare {
    public int maximum(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
}