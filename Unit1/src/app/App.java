package app;
import java.util.Scanner;





public class App {
    public static void main(String[] args) throws Exception{

      dog dog1 = new dog();
      dog dog2 = new dog();
      dog dog3 = new dog();
        Scanner input = new Scanner(System.in);
      dog1.name = "John";
      dog1.age = 5;
      dog1.breed = "Lab";
      dog1.weight = 64;
      dog1.furColor = "Black fur";
      dog1.height = 23;
      dog2.name = "Ron";
      dog2.age = 6;
      dog2.breed = "Great Dane";
      dog2.weight = 146;
      dog2.furColor = "Brown fur";
      dog2.height = 34;
      dog3.name = "Gone";
      dog3.age = 7;
      dog3.breed = "PomPom";
      dog3.weight = 6;
      dog3.furColor = "Golden fur";
      dog3.height = 23;

        System.out.println(dog1.name);
        System.out.println(dog1.age +" years old");
        System.out.println(dog1.breed);
        System.out.println(dog1.weight +" lbs");
        System.out.println(dog1.furColor);
        System.out.println(dog1.height +" inches tall");
        System.out.println(dog2.name);
        System.out.println(dog2.age +" years old");
        System.out.println(dog2.breed);
        System.out.println(dog2.weight +" lbs");
        System.out.println(dog2.furColor);
        System.out.println(dog2.height + " inches tall");
        System.out.println(dog3.name);
        System.out.println(dog3.age +" years old");
        System.out.println(dog3.breed);
        System.out.println(dog3.weight +" lbs");
        System.out.println(dog3.furColor);
        System.out.println(dog3.height +" inches tall");

    }
}
    

   

    
    
    
        

