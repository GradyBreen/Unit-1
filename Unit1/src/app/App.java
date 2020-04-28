package app;
import java.util.Scanner;


public class App {
    public static void main(final String[] args) throws Exception{

      Scanner input = new Scanner(System.in);

    System.out.println("Please enter your first name.");
    String firstName = input.nextLine();
    System.out.println("Please enter your last name.");
    String lastName = input.nextLine();
    System.out.println("Please enter your age");
    String age = input.nextLine();
    System.out.println("Please enter your grade number");
    String grade = input.nextLine();
    System.out.println("Please enter your favorite color");
    String color = input.nextLine();
    System.out.println("Hello, " + firstName + " " + lastName + " you are " + age + " years old, in grade " + grade + ", and you're favorite color is " + color );

    }
   }
    
    
    
    
        

