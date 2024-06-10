// method overwriting, because we have 2 add method, in the parent class and in the child class

class Calc 
{
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

class AdvCalc
{
    public int add(int n1, int n2) {
        return n1 + n2 + 1;
    }
}


public class MethodOverwriting {

    public static void main(String args[])
    {

        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(2, 6);
        System.out.println(r1);

    }

}
