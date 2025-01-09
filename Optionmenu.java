import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
public class Optionmenu extends Account{
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormate = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<Integer,Integer>();

    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {
                data.put(9657839,2004);
                data.put(6738921,1990);
                System.out.println("Welcome to the ATM !");
                System.out.println("Enter your customer number : ");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter your Pin number : ");
                setPinNumber(menuInput.nextInt());
            }
            catch (Exception e) {
                System.out.println("Invalid Charcter(s). Only Numbers.");
                x = 2;
            }
            int cn = getCustomerNumber();
            int pn = getPinNumber();
            if(data.containsKey(cn) && data.get(cn) == pn) {
                getAccountType();
            } else {
                System.out.println("Wrong customer number or wrong Pin number");
            }
        }
        while(x == 1);
    }
    public void getAccountType() {
        System.out.println("Select the account you want to access : ");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");

        int selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                getChecking();
                break;

            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for using this ATM");
                break;
            default:
                System.out.println("Invalid Choice");
                getAccountType();
        }
    }
    public void getChecking() {
        System.out.println("Checking Account : ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Fund");
        System.out.println("Type 3 - Deposite Fund");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice : ");

        int selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Checking Account Balance : " + moneyFormate.format(getCheckingBalance()));
                getAccountType();break;

            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getCheckingDepositeInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using this ATM.");
                break;
            default:
                System.out.println("Invalid Choice");
                getChecking();
        }
    }
        public void getSaving() {
        System.out.println("Saving Account : ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Fund");
        System.out.println("Type 3 - Deposite Fund");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice : ");

        int selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Saving Account Balance : " + moneyFormate.format(getSavingBalance()));
                getAccountType();break;

            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getSavingDepositeInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using this ATM.");
                break;
            default:
                System.out.println("Invalid Choice");
                getChecking();
        }
    }
}

