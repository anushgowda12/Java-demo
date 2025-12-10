class ab{
  ab()
  {
      System.out.println("hello");

  }
    ab(int a)
    {
        System.out.println(a);

    }
    ab(int a,int b)
    {
        System.out.println(a+" "+b);

    }
}

public class contructor2 {
    public static void main(String[] args) {
        ab obj=new ab();
        ab obj2=new ab(3);
        ab obj3=new ab(2,5);


    }
}
