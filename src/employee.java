
class employee1
{
    String emp_name ="vikas";
    int emp_id = 1234;
    int emp_salary =60000;

}
class department
{
    int dep_id =456;
    String dep_name ="sales ";

}
public class employee {
     public static void main(String[] args) {
     employee1 obj =new employee1();
     department obj2 =new department();
         System.out.println();
     System.out.println("employe's name is:"+obj.emp_name + " ");
     System.out.println("employe's emp_id is  :"+obj.emp_id  + " ");
     System.out.println("employe's emp_salary is:"+obj.emp_salary + " ");
     System.out.println();
     System.out.println("employe's department id is:"+obj2.dep_id+ " ");
     System.out.println("employe's  department name is :"+obj2.dep_name + " ");


     }
}

