import java.util.Scanner;
public class array4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of array : ");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.print("enter the array elements : ");
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("array elements are : ");
        int sum=0;
        for (int i=0;i<array.length;i++)
        {
            sum+=array[i];
        }
        System.out.println(sum);
    }
}