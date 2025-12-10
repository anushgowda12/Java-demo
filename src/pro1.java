import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class pro1 {
    public static void main(String[] args){
        File obj=new File("anush n.txt");
        try{
            if(obj.createNewFile()){
                System.out.println("file is created");
            }else {
                System.out.println("filed ");
            }
            FileWriter obj1=new FileWriter("seven.txt");
            obj1.write("bangalore is coolest ");
            obj1.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}