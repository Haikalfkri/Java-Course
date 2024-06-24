import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Scanner;


public class UserInput
{

    public static void main(String args[])  throws NumberFormatException, IOException
    {

        System.out.println("Enter a number");

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // int num = Integer.parseInt(bf.readLine());

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        int num = 0;
        BufferedReader br = null;
        try
        {
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            num = Integer.parseInt(br.readLine());
            System.err.println(num);
        }
        finally
        {
            br.close();
        }

        // bf.close();

    }

}