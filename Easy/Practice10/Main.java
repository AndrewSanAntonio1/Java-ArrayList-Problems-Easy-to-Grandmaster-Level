package Easy.Practice10;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        //Store first array
        list1.add("Andrew");
        list1.add("Patrick");

        //Print list 1
        System.out.println("List 1:");
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        // Store 2nd array
        list2.add("Emman");
        list2.add("David");

        //Print list 2
        System.out.println("List 2:");
        System.out.println(list1);

        //add 2nd array in list1
        list1.addAll(list2);

        //add line break
        System.out.println();

        // All in one
        System.out.println(list1);
    }
}
