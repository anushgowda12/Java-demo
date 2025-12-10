class java1
{
    public  void greet()   //method declaration
    {
        System.out.println("hello developer");
    }
    public int add(int a ,int b)
    {
        return a+b;
    }
    public int sub(int p ,int q)
    {
        return p-q;
    }
    public int mul(int d ,int c)
    {
        return d*c;
    }
    public int div(int x ,int y)
    {
        return x/y;
    }
}
public class methods2{
    public static void main(String[] args) {
        java1 obj=new java1();
        obj.greet();    //method call
        int r = obj.add(2,5);
        int s = obj.sub(8,3);
        int j = obj.mul(2,4);
        int l = obj.div(8,2);

        System.out.println(r);
        System.out.println(s);
        System.out.println(j);
        System.out.println(l);

    }
}
