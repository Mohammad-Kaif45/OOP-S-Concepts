import java.util.*;
import java.text.DecimalFormat;
public class Account {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormate = new DecimalFormat("'$'###,##0.00");
    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }
    public int getCustomerNumber() {
        return customerNumber;
    }

    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    // Wthdraw function for checking account or saving account
    public double calcCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    public double calcSavingWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    // Deposite function from checking account or saving account
    public double calcCheckingDeposite(double amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }
    public double calcSavingDeposite(double amount) {
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account Balance : " + moneyFormate.format(checkingBalance));
        System.out.println("Enter the Amount you want to withdraw from Checking Account : ");
        double amount = input.nextDouble();

        if((checkingBalance - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Acount Balance : " + moneyFormate.format(checkingBalance));
        } else {
            System.out.println("Balance cannot be Negative.");
        }
    }

    public void getSavingWithdrawInput() {
        System.out.println("Saving Account Balance : " + moneyFormate.format(savingBalance));
        System.out.println("Enter the Amount you want to withdraw from Saving Account : ");

        double amount = input.nextDouble();

        if((savingBalance - amount) >= 0) {
            calcSavingWithdraw(amount);
            System.out.println("New Saving Acount Balance : " + moneyFormate.format(savingBalance));
        } else {
            System.out.println("Balance cannot be Negative.");
        }
    }

    public void getCheckingDepositeInput() {
        System.out.println("Checking Account Balance : " + moneyFormate.format(checkingBalance));
        System.out.println("Enter Amount you want to Deposite to Checking Account : ");
        double amount = input.nextDouble();

        if((checkingBalance + amount) >= 0) {
            calcCheckingDeposite(amount);
            System.out.println("New Checking Account Balance : " + moneyFormate.format(checkingBalance));
        } else {
            System.out.println("Balance Cannot be negative.");
        }
    }
    public void getSavingDepositeInput() {
        System.out.println("Saving Account Balance : " + moneyFormate.format(savingBalance));
        System.out.println("Enter Amount you want to Deposite to Saving Account : ");
        double amount = input.nextDouble();

        if((savingBalance + amount) >= 0) {
            calcSavingDeposite(amount);
            System.out.println("New Saving Account Balance : " + moneyFormate.format(savingBalance));
        } else {
            System.out.println("Balance Cannot be negative.");
        }
    }
}
