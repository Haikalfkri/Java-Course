public class Inheritance {
    
    public static void main(String args[])
    {
        
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(10, 4);
        int r2 = obj.sub(20, 10);
        int r3 = obj.multi(2, 5);
        int r4 = obj.div(15, 3);
        double r5 = obj.power(2, 4);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);

    }

}
