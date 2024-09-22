import java.util.Scanner;

public class HdfcBank {
    static int initialAccountNumber = 100000;
    static int initialCustomerId = 1000;
    int accountNumber;
    String accountHolderName;
    int balance;
    String accountType;
    int customerId;
    String customerAddress;
    static String bankName = "HDFC Bank";

    HdfcBank (String accountHolderName, int balance, String accountType, String customerAddress){
    this.accountNumber =initialAccountNumber;
    this.accountHolderName=accountHolderName;
    this.balance=balance;
    this.accountType=accountType;
    this.customerId=initialCustomerId;
    this.customerAddress=customerAddress;
    initialAccountNumber++;
    initialCustomerId++;
    }
    public static void main (String[] args){

    }

    void deposit(int depositamt){
        System.out.println("deposit check :"+depositamt);
        if (depositamt>50000){
            System.out.println("Please Enter Pan :");
            Scanner sc = new Scanner(System.in);
            String pan = sc.nextLine();
            System.out.println("The PAN is :"+pan+"\t"+"deposit amount is  :"+depositamt+"\t"+"Available balance is :"+(depositamt+balance));
            System.out.println("\n");
        }else{
        System.out.println("Available balance :"+(depositamt+balance));
        System.out.println("\n");
    }
    }

    public String toString() {
        return "Account NO :"+initialAccountNumber +"\t"+ "Account holder Name :"+accountHolderName +"\t"+"Balance :"+balance+"\t"+"account type :"+accountType+
                "\t"+"Customer Id :"+initialCustomerId+"\t"+"Customer Address :"+customerAddress;
    }
}
