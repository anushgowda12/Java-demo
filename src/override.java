class A{
    public void mobile(){
        System.out.println("nokia c1");
    }
}
class B1 extends A{
    public void mobile(){



        System.out.println("Samsung");
    }
}
public class override {
    public static void main(String[] args) {
        B1 obj=new B1();
        obj.mobile();
    }
}
