package app;

import java.lang.ProcessBuilder.Redirect;

import jdk.nashorn.api.tree.WhileLoopTree;

public class App {
    public static void main(String[] args) throws Exception {
    int count = 0;
    

    while (count <= 10) {
        System.out.println("The count is " + count);   
        count = count + 1;  
    }
    System.out.println("Count finished");

    for (int i = 0; i <= 10; i = i +1){
    System.out.println("The count is " + i);
    System.out.println("Lets keep counting");
    }
    for (int u = 10; u <= 20; u = u +1){
        System.out.println("The count is " + u);
        System.out.println("Lets keep counting");
    }
    for (int o = 10; o <= 100; o = o +1){
        System.out.println("The count is " + o);
        System.out.println("Lets keep counting");
    }
    for (int p = 1000; p <= 256000; p = p +1){
        System.out.println("The count is " + p);
        System.out.println("Lets keep counting");
    }
    for (int l = 11; l <= 12; l = l +1){
        System.out.println("The count is " + l);
        System.out.println("Lets Keep counting");
    }
    for (int q = 10; q >= 0; q = q -1){
        System.out.println("The count is " + q);
        System.out.println("Lets Keep counting");
    }



}   


   
}
   