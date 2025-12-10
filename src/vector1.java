import java.util.Vector;

public class vector1 {
    public static void main(String[] args){
        Vector<String> cars = new Vector<>();//for vector
        cars.add("BMW");
        cars.add("Audi");
        cars.add("thar");
        System.out.println(cars);
        cars.add(1,"tata tigor");
        System.out.println(cars);
        cars.remove("Audi");
        System.out.println(cars);
        cars.addFirst("maruthi");
        System.out.println(cars);
        cars.addLast("Nissan");
        System.out.println(cars);
        cars.indexOf("maruthi");
        System.out.println(cars);

        cars.addFirst("Strobery");
        System.out.println(cars);
        cars.add(2,"water2");
        System.out.println(cars);

    }

}