class DataTypes {

    public static void main(String args[])
    {
        /* 
        integer -> byte, short, long, int
        float -> double, float
        character
        boolean -> true or false

        integer
            int -> 4 byte
            long -> 8 byte
            short -> 2 byte
            byte -> 1 byte
        
        float -> 4 byte
        float num = 5.6f
        double -> 8 byte
        double num = 5.6

        char -> 2 byte
        char c = 'k';

        boolean -> true or false
        boolean b = true 
        */

        int num = 10;
        byte by = 127; // range -128 -> 127
        short sh = 558;
        long l = 1200l;

        float fl = 2.6f;
        double dl = 2.6;

        boolean b = true;

        char c = 'k';

        int a = 257;
        byte k = (byte) a;

        float f = 5.6f;
        int t = (int) f;

        System.out.println(k);
        System.out.println(t);
    }

}
