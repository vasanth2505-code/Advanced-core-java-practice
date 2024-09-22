public class A
{
    Test test;
    A(Test test)
    {
        this.test = test;
    }
    void display()
    {
        System.out.println("A class display method called: "+test.value);
    }
}

class Test
{
    int value = 10;
    Test()
    {
        A a = new A(this);
        a.display();
    }
    public static void main(String[] args)
    {
        Test t = new Test();
    }
}

