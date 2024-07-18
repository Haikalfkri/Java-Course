
// {
//     private final int id;
//     private final String name;

//     public Alien(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public boolean equals(Object o) {
//         if (this == o) return true;
//         if (o == null || getClass() != o.getClass()) return false;
//         Alien alien = (Alien) o;
//         return id == alien.id && Objects.equals(name, alien.name);
//     }


//     @Override
//     public String toString() {
//         return "Alien{" + "id=" + id + ", name='" + name + '\'' + '}';
//     }
// }

record Alien(int id, String name) { }

class RecordClasses
{
    public static void main(String[] args) {
        
        Alien a1 = new Alien(1, "Test");
        Alien a2 = new Alien(1, "Test");

        System.out.println(a1.equals(a2));

    }
}