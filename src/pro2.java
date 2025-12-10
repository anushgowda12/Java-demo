import java.io.FileOutputStream;

public class pro2 {
    public static void main(String[] args){
        String content ="hello word";
        try(FileOutputStream obj=new FileOutputStream("seven.txt"))
        {
            System.out.println("file is created ");
            byte[] bytes=content.getBytes();
            obj.write(bytes);
        }
        catch (Exception e){
            System.out.println(e);

        }
    }
}