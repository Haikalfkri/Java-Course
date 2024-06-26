class A implements Runnable // extends Thread
{
    public void run()
    {
        for (int i = 1; i<=10; i++)
        {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable  // extends Thread
{
    public void run()
    {
        for (int i = 1; i<=10; i++)
        {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Threads
{

    public static void main(String[] args) {

        Runnable obj1 = new A();
        Runnable obj2 = new B();

        // obj1.start();
        // obj2.start();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

    }

}