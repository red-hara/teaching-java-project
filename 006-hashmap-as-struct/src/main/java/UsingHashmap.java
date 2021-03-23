import java.util.HashMap;

public class UsingHashmap {
    public static void main(String[] args) {
        HashMap<String, Object> storage = new HashMap<>();
        storage.put("name", "Demo Storage");
        storage.put("content", "The content that is held in this storage");

        System.out.println("Name of storage is " + storage.get("name"));
        System.out.println("Content is " + storage.get("conteent"));
    }
}