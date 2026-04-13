package BrowserBackButton;
import java.util.Scanner;
import java.util.Stack;

class BrowserBackButton {
    private Stack<String> undoStack;
    private String currentText;

    BrowserBackButton() {
        undoStack = new Stack<>();
        currentText = "";
    }

    public void type(String newText) {
        undoStack.push(currentText);
        currentText = newText;
        System.out.println("https://" + currentText);
    }

    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("No more history");
            return;
        }
        currentText = undoStack.pop();
        if (!undoStack.isEmpty()) {
            System.out.println("https://" + currentText);
        }
    }

}
public class Main {
    public static void main(String[] args) {
        BrowserBackButton browser = new BrowserBackButton();
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        browser.type(text);

        while(true) {
            System.out.print("Type URL or 'undo' or 'exit'? ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("exit")) {
                break;
            } else if (input.equals("undo")) {
                browser.undo();
            } else {
                browser.type(input);
            }
        }


    }
}
