class tatastrive {
    String Coursename4 ;
    String batchname4;
    int duration4;

   tatastrive (String Coursename,String batchname,int duration){
       Coursename4=Coursename;
       batchname4=batchname;
       duration4=duration;
   }
   public void tatastrivedetails(String address,long phonenumber){
        System.out.println( );
        System.out.println(Coursename4+" "+batchname4+" "+duration4+" "+address+" "+phonenumber+" ");
    }
}
public class constructor5 {
    public static void main(String[] args) {
        tatastrive obj = new tatastrive("JAVA-FULL-STACK ", "JFSD00001", 4);
        obj.tatastrivedetails("bangalore", 866070207);

    }
}


