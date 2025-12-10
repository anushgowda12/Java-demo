abstract class bird {
    String name;
    String color;

    bird(String name, String color) {
        this.name = name;
        this.color = color;
    }

    abstract void Bird1();

    abstract void Bird2(String name, String color, int age);

    void dog(String name, String Breed, String color) {

        System.out.println(name + " " + Breed + " " + color);
    }
}
class birds extends bird {
    birds(String name, String color) {
        super(name, color);
    }

    void Bird1() {
        System.out.println();
        System.out.println(name + " " + color);
    }

    void Bird2(String name, String color, int age) {

        System.out.println(name + " " + color + " "+age);
    }
}

public class abstract4 {
    public static void main(String[] args){
        birds obj=new birds("peacock", "green");
        obj.Bird1();
        obj.Bird2("pigeon","gray",5);
        obj.dog("charliee","german","white");
    }
}
