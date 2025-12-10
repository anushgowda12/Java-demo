import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class priqueue {
    public static void main(String[] args){
        ArrayDeque<Integer> agee=new ArrayDeque<>();//arraydeque
        agee.push(5);//adding element
        agee.push(4);
        agee.push(3);
        System.out.println(agee);
        agee.pop();//remove head element
        System.out.println(agee);
        agee.addFirst(9);
        System.out.println(agee);
        agee.addLast(5);
        System.out.println(agee);

    }
}