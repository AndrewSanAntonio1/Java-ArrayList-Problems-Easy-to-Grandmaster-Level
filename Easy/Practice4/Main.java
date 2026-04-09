package Easy.Practice4;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // Store an elements in Arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Coconut");
        list.add("Pineapple");

        //Size of ArrayList Before Removing element
        System.out.println(list);
        System.out.println("Size: " + list.size());
        //Removing element
        list.remove(3);
        System.out.println(list);
        //Size of ArrayList After Removing element
        System.out.println("Size: " + list.size());
    }
}
