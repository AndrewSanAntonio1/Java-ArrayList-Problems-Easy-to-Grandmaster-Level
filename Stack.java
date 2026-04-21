
import java.util.Scanner;
public class Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[0];
        int size = 0;
        int choice = 0;

        do {
            System.out.println("Menu");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter a number: ");
                int value = scanner.nextInt();

                int[] newValue = new int[size + 1];
                for (int i = 0; i < size; i++) {
                    newValue[i] = nums[i];
                }
                newValue[size] = value;
                nums = newValue;
                size++;
            } else if (choice == 2) {
                if (size == 0) {
                    System.out.println("Stack is Empty!");
                } else {
                    size--;
                }
            } else if (choice == 3) {
                for (int i = 0; i < size; i++) {
                    System.out.print(nums[i] + " ");
                }
                System.out.println();
            }
        } while (choice != 4);
    }
}
