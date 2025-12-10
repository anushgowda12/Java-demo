class multi extends Thread{
    public void run(){
        System.out.println("Threads 1");
    }
}
class multi2 extends Thread{
    public void run(){
        System.out.println("Threads 2");
    }
}
public class pro7 {
    public static void main(String[] args){
        Thread t1=new multi();
        t1.start();
        Thread t2=new multi2();
        t2.start();
    }
}