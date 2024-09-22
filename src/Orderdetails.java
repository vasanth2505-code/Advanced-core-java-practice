public class Orderdetails{

    public static void main (String args []){

        Orderr o = new Orderr();

        o.setName("Vasanth");
        o.setAddress("Chennai");
        o.setOrderId(234);
        o.setPrice(1221381349);

        System.out.println(o.getName());
        System.out.println(o.getAddress());
        System.out.println(o.getOrderId());
//        System.out.println(Order.platform);
//        System.out.println(Order.getPlatform());
        System.out.println(o.getPrice()+"\n");


        Orderr o1 = new Orderr();

        o1.setName("Akash");
        o1.setAddress("Hyderabad");
        o1.setOrderId(245);
        o1.setPrice(112321434);


        System.out.println(o1.getName());
        System.out.println(o1.getAddress());
        System.out.println(o1.getOrderId());
//        System.out.println(Order.platform);
//        System.out.println(Order.getPlatform());
        System.out.println(o1.getPrice());

    }
}