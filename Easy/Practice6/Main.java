package Easy.Practice6;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Store Values
        list.add(28);
        list.add(34);
        list.add(45);
        list.add(100);

        //list before replace one element in array
        System.out.println("Before:");
        System.out.println(list);

        //Replace index 2 45 to 54
        list.set(2, 54);

        //list after replace one element in a array
        System.out.println("After:");
        System.out.println(list);
        System.out.println(list.get(2));

    }
}
