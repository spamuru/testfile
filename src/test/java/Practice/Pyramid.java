package Practice;

import java.util.Arrays;
import java.util.HashSet;

public class Pyramid
{
    public static void main(String[] args)
    {
        int[] ia = {1,2,3,4,5,6,7,8,9,0};

        int rowcount=0;
        for (int i=0;i<ia.length;i++){
            for(int j=0;j<=ia.length-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=rowcount;j++) {
                System.out.print(ia[i]+" ");
                //different pattern
               // System.out.print(ia[i]+" ");
            }
            rowcount++;
            System.out.println();
        }
    }
}
