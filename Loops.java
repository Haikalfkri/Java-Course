public class Loops {
    
    public static void main(String args[]) {
        
        // while
        // while (i<=4) {
        //     System.out.println("i: " + i);
        //     i++;
        // }


        // do while
        // do {
        //     System.out.println("i: " + i);
        //     i++;
        // } while (i <= 4);

        
        // for
        // for (int i = 4; i>=1; i--) { // decrement
        //     System.out.println("hi " + i);
        // }

        for (int i = 1; i<=5; i++) {
            System.out.println("Day " + i);

            for (int j = 1; j <= 9; j++) {
                System.out.println("   " + (j+8) + " - " + (j+9));
            }
        }


        // ehanched for loop
        int nums[]=new int[4];
		nums[0]=4;
		nums[1]=8;
		nums[2]=3;
		nums[3]=9;
		
//		for (int i=0;i<nums/length;i++)
//		{
//			System.out.println(nums[i]);
//		}
		
		for(int n: nums)
		{
			System.out.println(n);
		}

    }

}
