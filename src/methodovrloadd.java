class bank{
    public void  HDFC(String name ,String address){
        System.out.println(name+" "+address+" ");
    }
    public void HDFC(String name ,String address,String IFSC,long accountno){
        System.out.println(name+" "+address+" "+IFSC+" "+accountno+" ");
    }
}

public class methodovrloadd {
    public static void main(String[] args) {
        bank obj=new bank();
        System.out.println();
        obj.HDFC("anush","bangalore");
        obj.HDFC("charan","ballary","CNR10002",123456789);

    }
}
