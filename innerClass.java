class A
{

    int age;

    public void show()
    {
        System.out.println("In Show");
    }

    static class B
    {
        public void config()
        {
            System.out.println("In Config");
        }
    }

}


public class innerClass
{
    public static void main(String args[])
    {

        A obj = new A();
        obj.show();

        // A.B obj1 = obj.new B();
        A.B obj1 = new A.B();
        obj1.config();

    }
}