class vehicle2 {
    String color1;

    vehicle2(String color1) {
        this.color1 = color1;

    }

    public void vdetails() {
        System.out.println(color1);
    }
}
class car2 extends vehicle2 {
    String regno1;
    int price1;

    car2(String regno1, int price1,String color1) {
        super(color1);
        this.regno1=regno1;
        this.price1=price1;


    }
    public void cardetails(){
        System.out.println(color1+" "+regno1+" " +price1);

    }
}
class bike2 extends car2{
    String name;
    bike2( String regno1,int price1,String color1,String name){

        super(regno1,price1,color1);
        this.name=name;
    }
    public void bikedetails(){
        System.out.println();
       System.out.println(regno1+" "+price1+" "+color1+" "+name+" ");
    }

}

public class inherits3 {
    public static void main(String[] args) {
        bike2 obj=new bike2("KA18M1394",3000000,"Black","himalayan");
        obj.bikedetails();
    }
}
