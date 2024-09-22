import java.util.ArrayList;
import java.util.List;

public class SwissCustomers extends Object {
	public static void main(String[] args) {
		List<SwissBank> customers = new ArrayList<>();
		SwissBank customer1 = new SwissBank("Vasanth", 500, "Chennai");
		customers.add(customer1);
		System.out.println(customer1);
//		customer1.depositeMethod(100000);
//		customer1.withdrawAmount(50000);
		SwissBank customer2 = new SwissBank("Anil", 500, "Kadapa");
		customers.add(customer2);
		System.out.println(customer2);
		SwissBank customer3 = new SwissBank("Akash", 500, "Hyderabad");
		System.out.println(customer3);
		customers.add(customer3);
		SwissBank customer4 = new SwissBank("Jhansi", 500000, "Pune");
		customers.add(customer4);
		System.out.println(customer4);
		
		SwissBank customer5 = new SwissBank("Rahul", 50000, "Swizerland");
		customers.add(customer5);
		SwissBank customer6 = new SwissBank("Gandi", 50000, "Swizerland");
		customers.add(customer6);
		
		customer1.transfer(10000, 101013, customers);
	}
}
