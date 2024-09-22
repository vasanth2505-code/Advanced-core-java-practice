public class HdfcCustomer {

    public static void main (String[] args){
        HdfcBank customer1 = new HdfcBank("vasanth", 200000, "salary", "chennai");
        System.out.println(customer1);
        customer1.deposit(51000);

//        System.out.println("AcctNo :"+customer1.initialAccountNumber+"\t"+"Name :"+customer1.accountHolderName+"\t"+"balance :"+ customer1.balance+"\t"+"Type :"+customer1.accountType+"\t"+"ID :"+customer1.initialCustomerId
//                +"\t"+"Address :"+customer1.customerAddress);

        HdfcBank customer2 = new HdfcBank("Akash", 5000000, "salary", "Hyderabad");
//        System.out.println("AcctNo :"+customer2.initialAccountNumber+"\t"+"Name :"+customer2.accountHolderName+"\t"+"balance :"+ customer2.balance+"\t"+"Type :"+customer2.accountType+"\t"+"ID :"+customer2.initialCustomerId
//                +"\t"+"Address :"+customer2.customerAddress);
        System.out.println(customer2);

        customer2.deposit(2000);
    }
}
