import java.util.PriorityQueue;
public class stack {
    static void main(String[] args) {
        PriorityQueue<Integer> name = new PriorityQueue<>();
        name.offer(3);
        name.offer(1);
        name.offer(6);
        name.offer(8);
        System.out.println(name);
        System.out.println(name.poll());
        System.out.println(name.peek());
    }
}
