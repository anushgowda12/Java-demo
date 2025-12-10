abstract class demo4{
    abstract void display();
    abstract void show();
    void kovi()
    {
        System.out.println("normal method");
    }
}
class ab8 extends demo4 {
    void display(){

        System.out.println("abstract class and methods");
    }
    void show(){
        System.out.println("Welcome developers");
    }
}
public class abstract1 {
    static void main(String[] args) {
      ab8 obj=new ab8();
      obj.display();
      obj.show();
      obj.kovi();
    }
}
