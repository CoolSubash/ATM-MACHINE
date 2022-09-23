import java.util.Scanner;

class Atmmachine{
    private int pin=2134;
    private double balance=0;
    Scanner number=new Scanner(System.in);

    public void start(){
        System.out.println("Please Enter Your Pin");
        int userpin=number.nextInt();
        if(pin==userpin){
           menu();
        }else{
            System.out.println("please Enter a Valid pin");
            start();
        }
    }
    public void withdraw() {
        System.out.println("Enter a money to withdraw");
        double withdrawmoney= number.nextDouble();
        if(withdrawmoney>balance){
            System.out.println("Insufficient balance");
        }else{
            balance=balance-withdrawmoney;
            System.out.println("Balance "+ withdrawmoney + " has been withdrawn");
        }


        menu();
    }
    public void deposit() {
        System.out.println("Enter a money to deposit");
        double deposit= number.nextDouble();
        balance=balance+deposit;
        System.out.println("Balance "+ deposit + " has been deposit");
        menu();
    }

    public double getBalance() {
        return balance;
    }

    public void menu(){
        System.out.println("Enter a Number for Operation");
        System.out.println("1. Balance Deposit");
        System.out.println("2. Balance Withdraw");
        System.out.println("3. Balance Check");
        System.out.println("4. Exits");
        int numbercheck= number.nextInt();
        if(numbercheck ==1){
            deposit();
        }else if(numbercheck ==2){
            withdraw();
        }else if(numbercheck ==3){
            System.out.println("The remaining balance is "+ getBalance());
            menu();
        }else if(numbercheck==4){
            number.close();
            System.out.println("Thank you for Choosing our ATM ");
        }
    }
}








public class Atm {
    public static void main(String[] args) {
        Atmmachine bank=new Atmmachine();
        bank.start();
    }
}
