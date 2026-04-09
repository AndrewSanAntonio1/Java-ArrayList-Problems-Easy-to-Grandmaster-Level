package Easy.Practice5;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Store number in ArrayList
        list.add(10);
        list.add(20);
        list.add(30);

        //Check if list contains value
        if (list.contains(10)) {
            System.out.println("Found");
        } else {
            // Not found in list
            System.out.println("Not Found");
        }
    }
}
