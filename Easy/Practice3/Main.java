package Easy.Practice3;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //Store Fruits
        list.add("Apple");
        list.add("Banana");
        list.add("Coconut");
        list.add("Watermelon");

        // List Before remove Apple
        System.out.println("Before:");
        System.out.println(list);
        //Remove Apple from the list
        list.remove("Apple");
        System.out.println("After:");
        System.out.println(list);

    }
}
