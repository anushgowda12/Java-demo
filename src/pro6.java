import java.io.File;
public class pro6 {
    public static void main(String[] args){
        File file=new File("anush n.txt");
        if (file.exists()) {
            if (file.exists()) {
                System.out.println("file deleted successfully");
            }
        }
        else {
            System.out.println("filed to delete file ");
        }
        file.delete( );
    }
}