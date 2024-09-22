public class rev{

//    static Order order=new Order();
    static{
        System.out.println("From SB I");
    }
    {
        System.out.println("From NS I");
    }
    public static void main(String vasanth[]){
        rev obj = new rev();
        System.out.println(obj);
//        System.out.println(order.name);
    }
    static{
        System.out.println("From SB II");
    }
    {
        System.out.println("From NS II");
    }
}