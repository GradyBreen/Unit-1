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
      dog2.name = "Ron";
      dog2.age = 6;
      dog2.breed = "Great Dane";
      dog3.name = "Gone";
      dog3.age = 7;
      dog3.breed = "PonPon";

        System.out.println(dog1.name);
        System.out.println(dog1.age);
        System.out.println(dog1.breed);
        System.out.println(dog2.name);
        System.out.println(dog2.age);
        System.out.println(dog2.breed);
        System.out.println(dog3.name);
        System.out.println(dog3.age);
        System.out.println(dog3.breed);


    }
}
    

   

    
    
    
        

