class dog1
{

    String  name ="siddu";
    int age = 2;
    String color="white";
}
class cat
{
    String name ="munna";
    int age= 3;
    String color="black";

}
public class oops3 {
    public static void main(String[] args){
        dog1 obj=new dog1();
        cat obj2=new cat();
        System.out.println("name is :"+obj.name+" ");
        System.out.println("Age is :"+obj.age+" ");
        System.out.println("color is:"+obj.color+" ");
        System.out.println("name is :"+obj2.name+" ");
        System.out.println("Age is :"+obj2.age+" ");
        System.out.println("color is:"+obj2.color+" ");
    }
}

