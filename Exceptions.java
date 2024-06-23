public class Exceptions 
{

    public static void main(String[] args) {

        int i = 0;
        int j = 0;

        int nums[] = new int[5];

        try {
            j = 18/i;
            System.out.println(nums[1]);
            System.out.println(nums[4]);
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divided by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bound");
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }

        System.out.println(j);

    }

}