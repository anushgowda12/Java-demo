class jav{
    public void demo(){
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
class react{
    public void demo(){
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
public class thread {
    public static void main(String[] args){
        jav obj=new jav();
        react obj1=new react();
        obj.demo();
        obj1.demo();
    }
}