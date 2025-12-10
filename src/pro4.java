import java.io.FileInputStream;
import java.io.FileInputStream;

public class pro4 {
    public static void main(String[] args){
        try (FileInputStream obj=new FileInputStream("charan.jpg"))
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