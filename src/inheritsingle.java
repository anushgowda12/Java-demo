class  dog2 {
    String color;
    String breed;
    dog2(String color,String breed)
    {
        this.color=color;
        this.breed=breed;

    }
    public void ddetails()
    {
        System.out.println();
        System.out.println(color+" "+breed);
    }

}
class babydog  extends dog2{
    String name;
    babydog(String name,String color,String breed)
    {
        super(color,breed);
        this.name=name;
    }
    public void bdetails(){
        System.out.println();
        System.out.println(name +" "+color+" "+breed);
    }
}
public class inheritsingle {
    public static void main(String[] args) {
        dog2 obj=new dog2("black","german" );
        babydog obj1=new babydog("danii","black","german");
        obj.ddetails();
        obj1.bdetails();

    }
}
