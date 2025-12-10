class java2{
    public int add(int a ,int b)
    {
        return a+b;

    }
    public int sub(int c ,int d)
    {
        return c-d;

    }
    public int mul(int p ,int q)
    {
        return p*q;

    }
    public int div(int x ,int y)
    {
        return x/y;

    }

}
public class simple {
   public static void main(String[] args) {
        java2 obj=new java2();
        int l =obj.add(2,4);
        int m =obj.sub(10,5);
        int n =obj.mul(5,6);
        int o =obj.div(4,2);
   System.out.println(l);
   System.out.println(m);
   System.out.println(n);
   System.out.println(o);
   }
}
