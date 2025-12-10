class parent{
    public void mobile2(String brand,String color,String rom,int price,String processor){
        System.out.println(brand+" "+color+" "+rom+" "+price+" "+processor+" ");
    }
}
class child extends parent{
    @Override
    public void mobile2(String brand,String color,String rom,int price,String processor){
        System.out.println(brand +" "+color+" "+rom+" "+price+" "+processor+" ");
    }
}
public class override2 {
    public static void main(String[] args) {
        child obj=new child();
        obj.mobile2("oneplus","blue","128gb",30000,"inbuilt");


    }

}
