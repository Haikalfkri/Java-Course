public class Strings {
    
    public static void main(String[] args) {
        
        // mutable string  -> change
        // immutable string -> unchange

        String name = "Navin";
        name = name + " Reddy";

        System.out.println("Hello " + name);

        String s1 = "Navin";
        String s2 = "Navin";

        System.out.println(s1 == s2);
        System.out.println(name.charAt(0));


    }

}
