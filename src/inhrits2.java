class A1{
    public void demo1(){
        System.out.println();
        System.out.println("Grand Parent");
    }
}
class B extends A1{
    public void demo2(){
        System.out.println();
        System.out.println("Parent");
    }
}
class C extends B{
    public void demo3(){
        System.out.println();
        System.out.println("Child");
    }
}
public class inhrits2 {
     public static void main(String[] args) {
        C obj=new C();
        obj.demo1();
        obj.demo2();
        obj.demo3();
    }
}