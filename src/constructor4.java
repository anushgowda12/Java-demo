class vehicle{
    String name1;
    int regno1;
    long price1;

    vehicle (String name ,int regno,int price){
        name1=name;
        regno1=regno;
        price1=price;
    }
    public void vehicledetails(String color){
        System.out.println( );
       System.out.println(name1+" "+regno1+" "+price1+" "+color);
    }
}
public class constructor4 {
    public static void main(String[] args) {
        vehicle obj=new vehicle("anush",1234,30000 );
        obj.vehicledetails("Black");

    }
}
