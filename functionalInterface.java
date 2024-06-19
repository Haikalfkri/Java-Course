@FunctionalInterface 
interface A // only can hava single abstrack method (SAM) if using functional interface
{
    void show();
}


public class functionalInterface {
    
    public static void main(String[] args) {
        
        A obj = new A() 
        {
            public void show()
            {
                System.out.println("in Show");
            }
        };
        obj.show();

    }

}
