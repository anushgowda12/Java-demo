class javaa extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("java developer");
            try{
                Thread.sleep(2500);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class reacta extends Thread{
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
public class thread1 {
    public static void main(String[] args){
        javaa obj=new javaa();
        reacta obj1=new reacta();
        obj.start();
        obj1.start();
    }
}