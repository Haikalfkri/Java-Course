class A
{
    public void show() {
        System.out.println("In A show");
    }
}

class B extends A
{
    public void show() {
        System.out.println("In B show");
    }
}


class C extends A 
{
    public void show() {
        System.out.println("In C show");
    }
}

public class DynamicMethodDispatch {
    
    public static void main(String args[])
    {

        // method overriding polymorphism
        A obj = new A();
        obj.show();

        // sign obj variable to new object, it work if the new object is subclass

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

    }

}
