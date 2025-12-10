public class largesarray {
    static void main(String[] args) {
        int  array[]={4,2,9,12,3,1};
        int large=array[0];
        for (int i=1;i<array.length;i++)
        {;
            if (array [i]>large)
            {
                large =array[i];
        }
        }
        System.out.println();
        System.out.println("largest element is  "+large);
    }
}
