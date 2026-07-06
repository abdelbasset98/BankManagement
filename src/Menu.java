import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
    int selection;

    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {
                data.put(123456, 5555);
                data.put(456789, 6666);
                System.out.println("Welcome to the Bank management Project! ");
                System.out.print("Enter your Customer Number : ");
                setCustomerNumber(menuInput.nextInt());
                System.out.print("Enter your PIN : ");
                setPinNumber(menuInput.nextInt());
            } catch (Exception e) {
                System.out.println("\n" + "Invalid character. ONLY NUMBERS!" + "\n");
                x = 2;
            }
            boolean loggedIn = false;
            for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
                if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
                    loggedIn = true;
                    getAccountType();
                    break;
                }
            }
            if (!loggedIn) {
                System.out.println("\n" + "Wrong Customer Number or PIN Number!");
            }
        } while (x == 1);
    }

    public void getAccountType() {
        System.out.println("Select the account you want to access : ");
        System.out.println("Type 1- Checking Account");
        System.out.println("Type 2- Saving Account");
        System.out.println("Type 3- Exit");
        System.out.print("CHOICE : ");

        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for using this Program!");
                break;
            default:
                System.out.println("\n" + "Invalid choice! " + "\n");
                getAccountType();
        }
    }

    public void getChecking() {
        System.out.println("Checking Account : ");
        System.out.println("Type 1- View Balance ");
        System.out.println("Type 2- Withdraw Funds");
        System.out.println("Type 3- Deposit Funds");
        System.out.println("Type 4- Exit");
        System.out.print("CHOICE : ");

        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance : " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using this Program!");
                break;
            default:
                System.out.println("\n" + "Invalid choice! " + "\n");
                getChecking();
        }
    }

    public void getSaving() {
        System.out.println("Saving Account : ");
        System.out.println("Type 1- View Balance ");
        System.out.println("Type 2- Withdraw Funds");
        System.out.println("Type 3- Deposit Funds");
        System.out.println("Type 4- Exit");
        System.out.print("CHOICE : ");

        selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Saving Account Balance : " + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using this Program!");
                break;
            default:
                System.out.println("\n" + "Invalid choice! " + "\n");
                getSaving();
        }
    }
}