class college {
    String name ;
    String address;

    college(String name,String address) {
        this.name = name ;
        this.address=address;

    }

    public void collegedetails() {
        System.out.println(name +" "+address);
    }
}
class department1 extends college {
    String dname ;


    department1(String name,String address,String dname ){
        super(name ,address);
        this.dname =dname ;



    }
    public void deptdetails(){
        System.out.println(name+" "+ address+" " +dname );

    }
}
class student extends department1{
    String sname;
    int  rollno;
    student( String name ,String address,String dname ,String sname,int rollno){

        super(name ,address,dname);
        this.sname=sname;
        this.rollno=rollno;
     }
    public void stddetails(){
        System.out.println();
        System.out.println(name +" "+address+" "+dname +" "+sname+" "+rollno);
    }

}

public class inherit4 {
    public static void main(String[] args) {
        student  obj=new student("dayanad sagar","bangalore","computer science","anush",1008);
        obj.stddetails();
    }
}
