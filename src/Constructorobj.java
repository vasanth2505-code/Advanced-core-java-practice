public class Constructorobj{

    Constructorobj()
    {
        this(250);
        System.out.println("Default Constructor");
    }
    Constructorobj(int num)
    {
        System.out.println("Parameterized Constructor"+num);
    }
    public static void main(String args [])
    {
        Constructorobj obj = new Constructorobj();
    }
}