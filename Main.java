public class Main {
    public static void main(String[] args){
       ATM_Project atm = new ATM_Project();
       
       while(true){

            atm.displayMenu();
            System.out.print("Enter your choice: ");
            int choice = atm.scanner.nextInt();

            switch(choice){
                case 1:
                    atm.checkBalance();
                    System.out.println("\n");
                    break;
                case 2:
                    atm.deposit();
                    System.out.println("\n");
                    break;
                case 3:
                    atm.withdraw();
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("Thank ypu for using ATM, Good Bye");
                    break;
                default:
                    System.out.println("Please choose a valid option");
            }
       }
    }
}
