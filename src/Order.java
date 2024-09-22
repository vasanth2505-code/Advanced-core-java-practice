public class Order {

    String name;
    String address;
    String street;
    int plotNo;

    Order() {
    }

    Order(String name, String address, String street, int plotNo) {
        this.name = name;
        this.address = address;
        this.street = street;
        this.plotNo = plotNo;
    }

    public static void main(String args[]) {
        Order obj = new Order("name", "address", "street", 100);
        System.out.println(obj.name+"\tcheck");
        Order obj1 = new Order("vasanth", "chennai", "springwell", 18);
        System.out.println(obj1.name);
        System.out.println(obj1.plotNo);
    }

    static {
        Order obj2 = new Order("Akash", "Hyderabad", "Unknown", 20);
        System.out.println(obj2.name+"\tsb");
        System.out.println(obj2.plotNo+"\tsb");
    }
}


