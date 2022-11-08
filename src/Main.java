import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        System.out.println("Enter the character you wanna count");
        char c = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                count++;
            }
        }

        System.out.println("character '" + c + "' appears " + count + " times");
    }
}