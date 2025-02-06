import java.util.Scanner;
public class ATM_Project {
    
    private double balance;
    public Scanner scanner;

    //Constructor
    public ATM_Project(){
        balance = 1000; // initial balance
        scanner = new Scanner(System.in);
    }

    public void displayMenu(){
        //to showw the entry options to the user
        System.out.println("ATM Menu");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void checkBalance(){
        System.out.println("Account Balance is: " + balance);
    }

    public void deposit(){
        System.out.println("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount> 0){
            balance += amount;
            System.out.println("$" + amount + "has been deposited");
            System.out.println("Your balance now is: $" + balance);
        }
        else{
            System.out.println("Invalid amount! Please add positive value!");
        }
    }

    public void withdraw(){
        System.out.println("Enter the amount you want to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("$"+ amount + "has been withdraw");
            System.out.println("Your balance now is: $" + balance);
        }
        else if (amount > balance){
            System.out.println("Insufficient funds. Your balance is $" + balance);
        }
        else{
            System.out.println("Invalid amount, please enter a positive value!");
        }
    }
}
