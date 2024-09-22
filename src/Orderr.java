public class Orderr{

    private String name;
    private String address;
    private int orderId;
    private long price;
//    final static String platform = "Amazon";

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public int getOrderId()
    {
        return orderId;
    }

    public long getPrice()
    {
        return price;
    }
//    static String getPlatform()
//    {
//        return  "You've order this from : "+platform;
//    }


    public void setName(String name)
    {
        this.name=name;
    }

    public void setAddress(String address)
    {
        this.address=address;
    }

    public void setOrderId(int orderId)
    {
        this.orderId=orderId;
    }

    public void setPrice(long price)
    {
        this.price=price;
    }




    public static void main (String args[]){}
}