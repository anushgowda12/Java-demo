class Car{
    String Fueltype ;
    int noofseat ;
    Car(String Fueltype,int noofseat )
    {
        this.Fueltype=Fueltype;
        this.noofseat=noofseat;

    }
    public void cardetails(){
        System.out.println(Fueltype+ " "+noofseat);
    }
}
class safari extends Car
{
    String Color;
    int Price;
    String model;
    safari(String Color,int Price,String model,String Fueltype,int noofseat){
        super(Fueltype,noofseat);
        this.Color=Color;
        this.model=model;
        this.Price=Price;
    }
    public void safaridetails(){
        System.out.println(Fueltype+ " "+noofseat+" "+Color+" "+model+" "+Price);
}

}

class harrier extends Car{
    String Color2;
    int Price2;
    String model2;
    harrier(String Color2,int Price2,String model2,String Fueltype,int noofseat){
        super(Fueltype,noofseat);
        this.Color2=Color2;
        this.model2=model2;
        this.Price2=Price2;
    }
    public void harrierdetails(){
        System.out.println(Fueltype+ " "+noofseat+" "+Color2+" "+model2+" "+Price2);
    }
}
public class hierachy2 {
    public static void main(String[] args) {
        safari obj=new safari("Green",5000000,"KA@2005","petrol",4);
        harrier obj1=new harrier("Blue",9000000,"KA@2006","petrol",5);
        obj.safaridetails();
        obj1.harrierdetails();
    }
}
