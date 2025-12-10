class maths{
    public  double cal(double p,double r){
        return p*r/100;

    }
    public double cal(double p,double r,double t)
    {
        return p*r*t/100;
    }
}
public class methodovrload {
     public static void main(String[] args) {
        maths obj=new maths();
         System.out.println();
         System.out.println(" principle of interest is ="+obj.cal(10,90));
         System.out.println(" principle of interest with time is ="+obj.cal(50,80,100));
    }
}
