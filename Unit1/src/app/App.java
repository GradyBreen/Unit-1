package app;

public class App {
    public static void main(String[] args) throws Exception{
    
        for(int i = 1; i <= 20; i++){
            if(i % 4 == 0){
                System.out.println(i + " is evenly divided by four");
            } else {
                System.out.println(i + " is not evenly divided by four");
            }
        }
        System.out.println("All finished");

    }

}
