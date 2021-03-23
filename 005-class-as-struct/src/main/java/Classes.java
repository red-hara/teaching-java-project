public class Classes {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.name = "Demo Storage";
        storage.content = "The content that is held in this storage";

        System.out.println("Name of storage is " + storage.name);
        System.out.println("Content is " + storage.content);
    }
}