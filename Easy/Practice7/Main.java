package Easy.Practice7;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //Store fruits in list
        list.add("Apple");
        list.add("Banana");
        list.add("Coconut");
        list.add("Pineapple");

        System.out.println("Fruits");
        // Print all using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }
}
