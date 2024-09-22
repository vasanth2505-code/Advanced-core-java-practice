// class Testclass {
//
//     void a(Testclass c)
//    {
//        System.out.println("From Instance Method I :" );
//    }
//
//    void b()
//    {
//       a(this);
//    }
//
//    public static void main (String args[])
//    {
//        Testclass ref = new Testclass();
//        ref.b();
//    }
//}

public class Testclass{

    void a(String ID)
    {
        System.out.println("From Instance Method I :" +ID );
    }

    void b()
    {
        a("name");
        System.out.println("From Instance Method II :" );
    }
    public static void main (String args [] ){
        Testclass ref = new Testclass();
        ref.b();
        ref.a("what");
    }
}