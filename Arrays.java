public class Arrays {
    
    public static void main(String args[])
    {

        // int nums[] = {3, 7, 2, 4};
        // nums[1] = 6; // change index 1

        // dynamic array
        int nums[] = new int[4]; // length 4 with int data type
        nums[0] = 2;
        nums[1] = 6;
        nums[2] = 8;
        nums[3] = 9;


        // System.out.println(nums[0]);
        // System.out.println(nums[1]);
        // System.out.println(nums[2]);
        // System.out.println(nums[3]);

        for (int i = 0; i < nums.length; i++) // nums.length to get length of the arrays, or you can use i < 4 or i <= 3
        {
            System.out.println(nums[i]);
        }
        
        
        // dimensional array

        int nums1[][] = new int[3][4]; // it look like [[0,0,0], [0,0,0], [0,0,0]]

        // add number to array
        // nums1[0][0] = 1;
        // nums1[0][1] = 2;
        // nums1[0][2] = 3;
        // nums1[0][3] = 4;

        // nums1[1][0] = 5;
        // nums1[1][1] = 6;
        // nums1[1][2] = 7;
        // nums1[1][3] = 8;

        // nums1[2][0] = 9;
        // nums1[2][1] = 10;
        // nums1[2][2] = 11;
        // nums1[2][3] = 12;


        // add number to array using for loop
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++) {
                int randomNum = (int)(Math.random() * 100); // initialize to get random number, range from 0 to 1
                nums1[i][j] = randomNum;
            }
        }

        // print using for loop
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.print(nums1[i][j] + " ");
            }
            System.out.println();
        }

        // another way
        for(int n[] : nums1) 
        {
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
        

        int nums2[][] = new int[3][]; // jagged array

        nums2[0] = new int[3];
        nums2[1] = new int[4];
        nums2[2] = new int[2];

        for (int i = 0; i < nums2.length; i++) 
        {
            for (int j = 0; j < nums2[i].length; j++)
            {
                System.out.print(nums1[i][j] + " ");
            }
            System.out.println();
        }
    }

}
