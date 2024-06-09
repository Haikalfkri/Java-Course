class Human
{
    private int age;
    private String name = "max";


    public Human() // constructor method
    { 
        this.age = 12; // default value of age
        this.name = "John"; // default value of name
    }

    // public Human(int age, String name)
    // {
    //     this.age = age;
    //     this.name = name;
    // }


    public void setAge(int newAge)
    {
        this.age = newAge;
    }
    
    public int getAge()
    {
        return age;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public String getName()
    {
        return name;
    }
}


public class Constructor {
    public static void main(String[] args) {
        
        Human obj = new Human();
        // Human obj1 = new Human(13, "Max");
        System.out.println(obj.getName() + " : " + obj.getAge());
        // System.out.println(obj1.getName() + " : " + obj1.getAge());

        // obj1.setAge(12);
        // obj1.setName("Max");

    }

}
