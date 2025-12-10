import  java.util.Scanner;
class person2
{
    public  void details(String name,int age )
    {
        System.out.println(name +" "+ age );

    }
}

public class usermethod
{
    public static void main(String[] args)
    {
        person2 obj=new person2();
        Scanner sc=new Scanner((System.in));
        System.out.println("enter the person details :");
        String name =sc.nextLine();
        int age =sc.nextInt();
        obj.details(name,age);
        obj.details("ram",21);

    }
}
