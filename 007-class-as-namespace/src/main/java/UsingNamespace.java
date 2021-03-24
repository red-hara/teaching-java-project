public class UsingNamespace {
    public static void main(String[] args) {
        Namespace.counter = 3;
        Namespace.printHello();

        String greeting = Namespace.getGreeting("John Doe");
        System.out.println(greeting);
    }
}
