class a  //parent class
{
    public void demo1()
    {
        System.out.println();
        System.out.println("hello parent");
    }
}
class b extends a  //child class
{
    public void demo2()
    {
        System.out.println();
        System.out.println("hello child and  parent");
    }
}
public class inherit1 {
    public static void main(String[] args) {
         b obj =new b();
         obj.demo1();
         obj.demo2();

    }
}
