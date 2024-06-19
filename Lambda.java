@FunctionalInterface
interface A
{
    // void show(int i);
    int add(int i, int j);
}


public class Lambda {
    
    public static void main(String[] args) {
        
        // lambda just work for functional interface
        A obj = (i, j) -> i+j; // lambda expression will automatically return
            // {
            //     return i + j;
            // };
            // System.out.println("in Show " + i); // lambda
            // { // lambda
            //     System.out.println("in Show " + i);
            // };
        int result = obj.add(5, 4);
        System.out.println(result);

    }

}
