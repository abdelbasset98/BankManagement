import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner input=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
    int customerNumber;
    int pinNumber;

    public int setCustomerNumber(int i){
        this.customerNumber=i;
        return customerNumber;
    }

    public int getCustomerNumber(){
        return customerNumber;
    }

    public int setPinNumber(int i){
        this.pinNumber=i;
        return pinNumber;
    }
    public double getCheckingBalance(){
        double checkinBalance = 0;
        return checkinBalance;
    }
    public double getSavingBalance(){
        double savinBalance = 0;
        return savinBalance;
    }
    public double calcCheckingWithdraw(double amount){
        double checkingBalance = 0;
        checkingBalance=(checkingBalance - amount);
        return checkingBalance;
    }
    public double calcSavingWithdraw(double amount){
        double savingBalance = 0;
        savingBalance=(savingBalance - amount);
        return savingBalance;
    }
    public double calcCheckingDeposit(double amount){
        double checkingBalance = 0;
        checkingBalance=(checkingBalance + amount);
        return checkingBalance;
    }
    public double calcSavingDeposit(double amount){
        double savingBalance = 0;
        savingBalance=(savingBalance - amount);
        return savingBalance;
    }
    public void getCheckingWithdrawInput(){
        double checkingBalance = 0;
        System.out.println("Checking Account Balance : " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to withdraw from checking account : ");
        double amount=input.nextDouble();

        if ((checkingBalance - amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance : "+ moneyFormat.format(checkingBalance));
        }else {
            System.out.println("Balance cannot be negative!! "+ "\n");
        }
    }
    public void getSavingWithdrawInput(){
        double savingBalance = 0;
        System.out.println("Saving Account Balance : " + moneyFormat.format(savingBalance));
        System.out.print("Amount you want to withdraw from saving account : ");
        double amount=input.nextDouble();

        if ((savingBalance - amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("New Saving Account Balance : "+ moneyFormat.format(savingBalance));
        }else {
            System.out.println("Balance cannot be negative!! "+ "\n");
        }
    }
    public void getCheckingDepositInput(){
        double checkingBalance = 0;
        System.out.println("Checking Account Balance : " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to deposit from checking account : ");
        double amount=input.nextDouble();

        if ((checkingBalance - amount)>=0){
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account Balance : "+ moneyFormat.format(checkingBalance));
        }else {
            System.out.println("Balance cannot be negative!! "+ "\n");
        }
    }
    public void getSavingDepositInput(){
        double savingBalance = 0;
        System.out.println("Saving Account Balance : " + moneyFormat.format(savingBalance));
        System.out.print("Amount you want to deposit from saving account : ");
        double amount=input.nextDouble();

        if ((savingBalance - amount)>=0){
            calcCheckingDeposit(amount);
            System.out.println("New Saving Account Balance : "+ moneyFormat.format(savingBalance));
        }else {
            System.out.println("Balance cannot be negative!! "+ "\n");
        }
    }
    public int getPinNumber(){
        return pinNumber;
    }


}