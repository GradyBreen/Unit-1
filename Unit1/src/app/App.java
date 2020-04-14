package app;

import java.lang.ProcessBuilder.Redirect;

import jdk.nashorn.api.tree.WhileLoopTree;

public class App {
    public static void main(String[] args) throws Exception {
    int count = 0;
    String color = "red";
    boolean ben = false;

    while (count <= 10) {
        System.out.println("The count is " + count);   
        count = count + 1;  
    }
    System.out.println("Count finished");

    while (color == "Red"){
    System.out.println("the color is " + color);
    color = "green";
    }
   
    System.out.println("color finished");
    
  
    while (ben = false){
        System.out.println("is Benjamin Franklin running for president? " + ben);
        ben = true;
    }

    System.out.println("question finished");
    }

}   
   
   
   