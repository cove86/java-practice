import java.util.Scanner;

public class JavaIO {
    public static void main( String[] args ) {
        // Define a new scanner
        Scanner input = new Scanner(System.in);
        // Print question to the console
        System.out.println("What is your name?");
        // store anwser in variable
        String userName = input.next();
        // print using printf
        System.out.printf("Hello %s! It's nice to meet you.\n", userName);
    }
}
