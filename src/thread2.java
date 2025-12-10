class jav2 implements Runnable{//run with interface
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("java developer");
            try{
                Thread.sleep(5000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class react2 implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("react developer");
            try{
                Thread.sleep(1500);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
public class thread2 {
    public static void main(String[] args){
        jav2 obj=new jav2();
        react2 obj1=new react2();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);
        t1.start();
        t2.start();
    }
}