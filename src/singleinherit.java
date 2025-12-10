class  cat1{
    String color;
    String breed;
    cat1(String color,String breed)
    {
        this.color=color;
        this.breed=breed;

    }
    public void cdetails()
    {
        System.out.println();
        System.out.println(color+" "+breed);
    }

}
class babycat  extends cat1{
    String name;
    babycat(String name,String color,String breed)
    {
        super(color,breed);
        this.name=name;
    }
    public void bcdetails(){
        System.out.println();
        System.out.println(name +" "+color+" "+breed);
    }
}
public class singleinherit {
    public static void main(String[] args) {
        cat1 obj=new cat1("White","persian" );
        babycat obj1=new babycat("kitty","White","persian");
        obj.cdetails();
        obj1.bcdetails();

    }
}
