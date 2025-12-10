class person3
{
    String name2 ;
    int age2;
    person3(String name ,int age ){
        name2=name ;
        age2=age;

    }
    public void details(){
        System.out.println( );
        System.out.println(name2+" "+age2);

}
}

public class constructor3 {
    public static void main(String[] args) {
        person3 obj=new person3("anush",23);
        obj.details();


    }
}
