import java.util.ArrayList;

public class list{
    static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        System.out.println();
        fruits .add ("Mangoes");
        fruits .add ("Pineapple");
        fruits .add ("Strawberry");
        System.out.println(fruits);
        fruits .add (1,"Pineapple");
        System.out.println(fruits);
        fruits.remove(3);
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.get(1));
        System.out.println(fruits.set(2,"kivi"));
        System.out.println(fruits);
        System.out.println(fruits.contains("banana"));
        System.out.println(fruits.isEmpty());
        fruits.remove("pineapple");
        System.out.println(fruits);
        fruits.addFirst("grapes");
        System.out.println(fruits);
        fruits.addLast("gauva");
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);
    }
}
