//Ques. Design a user defined exception class for validating age of a person to vote.
import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class agevalidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new AgeException("You are not eligible to vote.");
            } else {
                System.out.println("You are eligible to vote.");
            }
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}