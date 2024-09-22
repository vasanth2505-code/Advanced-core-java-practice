public class Thisinmethod {

     void a(String a){
        System.out.println(a);
    }

    void b(){
        a("vasanth");
    }
    public static void main(String args [])
    {
    Thisinmethod obj = new Thisinmethod();
    obj.b();
    }
}
