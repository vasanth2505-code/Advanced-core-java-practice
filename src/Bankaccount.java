import java.util.Scanner;

public class Bankaccount {
    Accountnumber account;

//    int accountNumber;
//    String accountHolderName;
//    int balance;
//    String accountType;
//    int customerId;
//    String customerAddress;
//    final static String bankName = "HDFC";
//    static int customerId = 100;
//    static int accountNumber = 1000000;


    static void deposit() {
        int damt;
        String pan;
        System.out.println("Enter the Amount to be deposited : ");
        Scanner sc2 = new Scanner(System.in);
        damt = sc2.nextInt();
//        System.out.println("The amount entered is : " + damt);
        if (damt > 50000) {
            System.out.println("Please provide ur PAN card Details : ");
            pan = sc2.next();
            System.out.println("\n");
            System.out.println("Entered PAN Number is : " + pan);
            System.out.println("Amount deposited is : " + damt + "------Depositted Successfully\n");
        } else {
            System.out.println("\n");
            System.out.println("Amount is been deposited is : " + damt + "----Depositted Successfully\n");
        }

    }

    static void withdraw() {
        int wamt;
        System.out.println("Enter the Amount to be withdrawn : ");
        Scanner sc1 = new Scanner(System.in);
        wamt = sc1.nextInt();
//      System.out.println("The WithdrawnAmount is : " + wamt);
        if (wamt > 100000) {
            System.out.println("Sorry, The amount is exceeding the current amount - withdrawal Failed -Recheck your Inputs- Tryagain");
        }
        if (wamt < 1000) {
            System.out.println("The Minimum withdrawal amount is 1000 ------- please Tryagain");
        } else {
            System.out.println("\n");
            System.out.println("Amount Withdrawed is : " + wamt + "---------Withdrawal Success\n");
        }
    }

//        static void transfer(  ){
//        int tacctnumber;
//        int tamt;
//        Scanner sc3 = new Scanner(System.in);
//        System.out.println("Enter the account number, the money to be Transferred to : ");
//            tacctnumber = sc3.nextInt();
//        System.out.println("The Transfer Account Number is : "+ tacctnumber);
//        System.out.println("Enter the Amount to be transferred : ");
//            tamt = sc3.nextInt();
//        System.out.println("The Transferred Amount is : "+ tamt);
//    }

    public static void main(String vasanth[]) {
        deposit();
        withdraw();
//      transfer();

        Accountnumber act = new Accountnumber();
        System.out.println("Enter the Customer Details");

        Scanner acts = new Scanner(System.in);
        System.out.println("Enter the Account holder's Name : ");
        Accountnumber.accountHolderName = acts.next();
        System.out.println("Enter the Account holder's address : ");
        Accountnumber.customerAddress = acts.next();
        System.out.println("Enter the Account holder's Account type : ");
        Accountnumber.accountType = acts.next();
        System.out.println("\n");

        System.out.println("Bank Name : " + Accountnumber.bankName);
        System.out.println("Account Holder's Name : " + act.accountHolderName);
        System.out.println("Account Holder's Address : " + act.customerAddress);
        System.out.println("Account Type : " + act.accountType);
        System.out.println("Customer ID :" + (++act.customerId));
        System.out.println("Account Number :" + (++act.accountNumber));
        System.out.println("\n");
//        System.out.println(act.balance);


        Accountnumber act1 = new Accountnumber();
        System.out.println("Enter the Customer Details");

        Scanner acts1 = new Scanner(System.in);
        System.out.println("Enter the Account holder's Name : ");
        Accountnumber.accountHolderName = acts1.next();
        System.out.println("Enter the Account holder's address : ");
        Accountnumber.customerAddress = acts1.next();
        System.out.println("Enter the Account holder's Account type : ");
        Accountnumber.accountType = acts1.next();
        System.out.println("\n");

        System.out.println("Bank Name : " + Accountnumber.bankName);
        System.out.println("Account Holder's Name : " + act1.accountHolderName);
        System.out.println("Account Holder's Address : " + act1.customerAddress);
        System.out.println("Account Type : " + act1.accountType);
        System.out.println("Customer ID :" + (++act.customerId));
        System.out.println("Account Number :" + (++act.accountNumber));
//      System.out.println(act1.balance);
    }
}
