public class Constructorinj {

    String name;
    String address;
    int number;
    int block;

    Constructorinj()
    {

    }
// Constructor injection
    Constructorinj(String name , String address, int number, int block)
    {
        this.name=name;
        this.address=address;
        this.number=number;
        this.block=block;
    }
// Create a new class object and add the parameter's value inside the constructor;
// Use this.object Reference to access it and print the values.

    public static void main (String args [])
    {
        Constructorinj obj = new Constructorinj("Vasanth", "Chennai", 18 , 11);
        System.out.println(obj.name);
        System.out.println(obj.address);
        System.out.println(obj.number);
        System.out.println(obj.block);
    }
}
