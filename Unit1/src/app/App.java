package app;

public class App {
    public static void main(final String[] args) throws Exception{

        System.out.println("Start first Loop");

        for (int i = 20; i >0; i--){
        if (i == 10){
        int x = 1;
        while (x <= 6){
        System.out.println(i);
        x++;
       } 
       
        }else{
        System.out.println(i);
     }  
    }  
        System.out.println("End first loop");
        System.out.println("Start second loop");

        for(int i = 0; 36 >= i; i = i + 4){
        if(i % 6 == 0){
        System.out.println(i);
        System.out.println("Hey!");}
        
    else{
      System.out.println(i);
     }
        }
 }
}
        

