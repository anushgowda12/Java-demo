class one
{
    public void parent()
    {
        System.out.println("parent ");
    }
}
class two extends one
{
    public void child()
    {
        System.out.println("child");
    }
}
class three extends one
{
    public void child1()
    {
        System.out.println("child1");
    }
}
public class hierachy
{
    public static void main(String[] args)
    {

        two obj=new two();
        three obj1= new three();
        obj1.parent();
        obj1.child1();
        obj.child();
        obj.parent();

    }
}
