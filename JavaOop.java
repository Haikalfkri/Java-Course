class Calculator 
{
    public int add(int num1, int num2)
    {
        // System.out.println("In add");
        int res = num1 + num2;
        return res;
    }

}

public class JavaOop 
{
    
    public static void main(String[] args)
    {

        int num1 = 4;
        int num2 = 5;

        Calculator calc = new Calculator(); // initialize the class and create the object

        int result = calc.add(num1, num2);

        // int result = num1 + num2;

        System.out.println(result);

    }

}
