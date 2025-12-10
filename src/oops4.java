class car
{
    String name="ford";
    int price =800000;
    String color ="white";
    String model ="123abc";
    String regno ="ka18";

}
class bike
{
    String name ="himalayan";
    int  price =200000;
    String color ="black";

}
public class oops4 {
    public static void main(String[] args) {
        car obj=new car();
        bike obj2=new bike();
        System.out.println("car name is :"+obj.name+" " );
        System.out.println("car price is :"+obj.price+" " );
        System.out.println("car color is :"+obj.color+" " );
        System.out.println("car model is :"+obj.model+" " );
        System.out.println("car regno is :"+obj.regno+" " );
        System.out.println();
        System.out.println("bike name is :"+obj2.name+" " );
        System.out.println("bike price is :"+obj2.price+" " );
        System.out.println("bike color is :"+obj2.color+" " );


    }

}
