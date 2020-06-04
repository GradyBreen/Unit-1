package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{
    Scanner input = new Scanner(System.in);
    Account account1 = new Account();
    
    System.out.println("What is your name?");
    account1.name = input.nextLine();
    
    System.out.println("What is your starting balance");
    account1.startingBalance = input.nextInt();

    System.out.println("What passcode do you want?");
    account1.password = input.nextInt();

    System.out.println("Account created, log in");

    System.out.println("What is your name?");
    input.nextLine();
    String nameReal = input.nextLine();
    if(nameReal.equals(account1.name)){
        System.out.println("Enter your password");
        int passcodeReal = input.nextInt();

        if (passcodeReal == account1.password) {
            System.out.println("Welcome, " + account1.name + "!");
            System.out.println(
                "What would you like to do? To check balance press 1, to make a withdrawl press 2, to change password press 3, or exit press 4");
            account1.operator = input.nextInt();


        }
   if(account1.operator == 2) {
       System.out.println("Enter amount you want to withdrawl");
       int withdrawl = input.nextInt();
       System.out.println("Your balance is $" + (account1.startingBalance - withdrawl));
       account1.startingBalance = account1.startingBalance - withdrawl);
       System.out.println("Would you like to check your balance by pressing 1, withdrawl by pressing 2, change passcode by pressing 3, or exit by pressing 4?");
       account1.operator = input.nextInt();
   }
   if (account1.operator == 3) {
       System.out.println("What password do you want?");
       account1.password = input.nextInt();
       System.out.println("Password changed! Please re enter your password");
        passcodeReal = input.nextInt();
       if (passcodeReal == account1.password){ System.out.println("Passcode changed");
     }System.out.println("Would you like to check balance by pressing 1, withdrawl money by pressing 2, change password by pressing 3, or exitin by pressing 4?");  
    }
 else { System.out.println("Access denied");
}
    } if (account1.operator == 4){
        System.out.println("Thank you! Have a nic day!");
    }
}
}