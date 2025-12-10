abstract class demo3{
    abstract void person(String name,int age);
}
class ab1 extends demo3{
    @Override
    void person(String name, int age) {
        System.out.println(name +" "+age);
    }
}
public class abstract2 {
    static void main(String[] args) {
        ab1 obj=new ab1();
        obj.person("anush",23);
    }
}