import java.util.Scanner;

public class Scannerlogic {

    public static void main (String args []){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the String1 : ");
        String name1 = sc1.next();
        System.out.println("The String1 is : "+name1);

        Scanner sc2 = new Scanner(System.in);
        System.out.println("\n Enter the String2 : ");
        String name2 = sc2.nextLine();
        System.out.println("The String is : "+name2);
    }
}
