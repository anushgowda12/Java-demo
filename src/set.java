import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String[] args){
        TreeSet<Integer> age=new TreeSet<>() ;//set Tree set
        age.add(1);
        age.add(2);
        age.add(3);
        System.out.println(age);
        age.remove(1);
        System.out.println(age);
        age.first();//to fetch small element
        System.out.println(age);
        age.last();//to fetch large element
        System.out.println(age);

        System.out.println(age.ceiling(1));//it's fetch grater then elements
        System.out.println(age.floor(3));//it's fetch smaller element
        System.out.println(age.higher(2));
        System.out.println(age.lower(2));
        System.out.println(age);
    }
}