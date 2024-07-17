// class A implements Runnable // extends Thread
// {
//     public void run()
//     {
        
//     }
// }

// class B implements Runnable  // extends Thread
// {
//     public void run()
//     {
        
//     }
// }

class Counter 
{
    int count;
    public void increment() {
        count++;
    }

}
public class Threads
{

    public static void main(String[] args) {

        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 1; i<=100; i++)
            {
                // System.out.println("hi");
                // try {
                //     Thread.sleep(10);
                // } catch (InterruptedException e) {
                //     e.printStackTrace();
                // }
                c.increment();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i<=100; i++)
            {
                // System.out.println("hello");
                // try {
                //     Thread.sleep(10);
                // } catch (InterruptedException e) {
                //     e.printStackTrace();
                // }
                c.increment();
            }
        };

        // obj1.start();
        // obj2.start();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        System.out.println(c.count);

    }

}