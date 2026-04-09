package Easy.Practice8;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        //Store Names in list
        names.add("Andrew");
        names.add("Alenere");
        names.add("David");
        names.add("Patrick");

        System.out.println("Student Name:");
        // Print all names using foreach loop
        for (String name : names) {
            System.out.println(name);
        }
    }
}
