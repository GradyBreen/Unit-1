package app;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception{

      Scanner input = new Scanner(System.in);
    
        System.out.println("Enter a noun");
        String noun = input.nextLine();
        System.out.println("Enter a name");
        String name = input.nextLine();
        System.out.println("Enter a verb");
        String verb = input.nextLine();
        System.out.println("Enter an adjvective");
        String adjective = input.nextLine();
        System.out.println("Enter a place");
        String place = input.nextLine();
        System.out.println("Enter a food");
        String food = input.nextLine();
        System.out.println("Enter an animal");
        String animal = input.nextLine();
        System.out.println("Enter a number");
        String number = input.nextLine();    
   
   
        System.out.println("There was once a guy nicknamed " + noun + " " + name + ". He " + verb + " down the street to the " + adjective + " " + place + " to get his favorite food, a " + food + " famously made of " + animal + " he ordered " + number + " of this amazing food. He enjoyed it thoroughly");
   
   
   
    }


        
        
    }

    

   

    
    
    
        

