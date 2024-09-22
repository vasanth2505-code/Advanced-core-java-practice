import java.util.Scanner;

public class Withdrawallogic {

    public static void main(String args[]) {
        int extamt = 100000;
        int withdrawamt;
//       String pan;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Withdrawal amount : ");
        withdrawamt = sc.nextInt();
//        System.out.println("The Entered amount is :"+withdraw);
        if (withdrawamt < extamt) {
            System.out.println("The withdrawal amount is  :" + withdrawamt);
            if (withdrawamt > 50000) {
                System.out.println("Enter the PAN nO:");
                Scanner sc1 = new Scanner(System.in);
                String pan = sc1.nextLine();
                char[] charArray = pan.toCharArray();
                System.out.println("The PAN entered is :" + pan);
                if (charArray.length != 10) {
                    System.out.println("The entered PAN No is wrong");
                } else {
                    if(charArray[3] == 'p'){
                        System.out.println("personal PAN");
                    }if(charArray[3] == 'a'){
                        System.out.println("Association PAN");
                    }if(charArray[3] == 'c'){
                        System.out.println("Company PAN");
                    }
                    System.out.println("The Withdrawal is sucessfull for amount : " + withdrawamt);
                    System.out.println("The available balance is : "+(extamt-withdrawamt));
                }
            } else {
                System.out.println("Amount Withdraw for " + withdrawamt + " is successful No PAN required");
                System.out.println("The available balance is : "+(extamt-withdrawamt));
            }
        } else {
            System.out.println("Withdraw declined amount is exceeding");
        }
    }
}
