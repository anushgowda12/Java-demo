class Java{
    public void add(int a,int b){
        System.out.println(a+b);

    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

}
public class methodoverld {
    static void main(String[] args) {


        Java obj = new Java();
        obj.add(2, 5);
        obj.add(4, 5, 6);
    }
}