class Calculator 
{
    public int add(int num1, int num2)
    {
        int res = num1 + num2;
        return res;
    }

    public int multiply(int num1, int num2) 
    {
        int res = num1 * num2;
        return res;
    }

}


class Computer {

    public String playGames() 
    {
        return "Playing Games";
    }

    public String randomString() 
    {
        return "Random String";
    }

}

public class Methods 
{
    
    public static void main(String[] args)
    {

        int num1 = 4;
        int num2 = 5;

        Calculator calc = new Calculator(); // initialize the class and create the object

        int add = calc.add(num1, num2);
        int multiply = calc.multiply(num1, num2);

        System.out.println(add);
        System.out.println(multiply);



        Computer comp = new Computer();

        String playGames = comp.playGames();
        String randomString = comp.randomString();

        System.out.println(playGames);
        System.out.println(randomString);

    }

}
