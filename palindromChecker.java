import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input some text: ");
        String userText = userInput.nextLine();

        palindromeCheck(userText);
    }

    public static void palindromeCheck(String userText) {
        String revStr = "";
        char ch;
        for (int i = 0; i < userText.length(); i++) {
            ch = userText.charAt(i);
            revStr = ch + revStr;
        }

        String txt1 = userText.toLowerCase();
        String txt2 = revStr.toLowerCase();

        if (txt2.equals(txt1)) {
            System.out.println(txt1 + " is a palindrome!");
        } else {
            System.out.println(txt2 + " is not a palindrome.");
        }
    }
}
