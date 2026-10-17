import java.util.Scanner;

public class WordPalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next();

        StringBuilder reversed = new StringBuilder(word);
        reversed.reverse();

        System.out.print(reversed + " - ");

        if (word.equalsIgnoreCase(reversed.toString())) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }

        sc.close();
    }
}
