import java.io.FileReader;

public class pro3 {
    public static void main(String[] args){
        try (FileReader obj=new FileReader("anush n.txt"))
        {
            int c;
            while ((c=obj.read())!=-1)
            {
                System.out.print((char)c);
            }
        }
        catch(Exception e) {
            System.out.print(e);
        }
    }
}