package app;

public class App {
    public static void main(final String[] args) throws Exception{

      System.out.println("Start First Loop");

      {for( int i = 1; i<11; i++)
      if (i == 5){
        System.out.println("five");
      }else {
        System.out.println(i);
    }}
    System.out.println("End first loop");
    System.out.println("Start second loop");

    for (int x = 100; x < 201; x=x+10)
    if (x == 150) { for (int j = 150; j < 161; j++)
        System.out.println(j);
    }else{
        System.out.println(x);
    }
    System.out.println("End second loop");
    }
   }
    
    
    
    
        

