// enum Status
// {
//     Running, Failed, Pending, Success;
// }

enum Laptop
{
    Macbook(2000), XPS(2200), Surface(1400), ThinkPad(1400);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

}


public class Enum
{
    public static void main(String[] args) {
 
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + " : " + lap.getPrice());

        for (Laptop lap : Laptop.values())
        {
            System.out.println(lap + " : " + lap.getPrice());
        }

    }
}