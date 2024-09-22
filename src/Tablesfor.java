import java.util.Scanner;

//    static execution(){
//
//    }
public class Arraytables {
    public static void main(String args[]) {
        System.out.println("Enter the Table's Number : ");
        Scanner sc = new Scanner(System.in);
        int table = sc.nextInt();
        System.out.println(table + "Table");
        int[] tables = new int[10];

        for (int i = 1; i <= 10; i++) {

            System.out.println(table + "*" + (i) + "=" + (table * i));
        }
    }
}
