class Human
{
    private int age;
    private String name = "max";

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


public class Encapsulation {
    public static void main(String[] args) {
        
        Human obj1 = new Human();
        obj1.setAge(12);
        obj1.setName("Max");

        System.out.println(obj1.getName() + " : " + obj1.getAge());

    }

}
