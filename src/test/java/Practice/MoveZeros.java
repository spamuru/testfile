package Practice;

import java.util.Arrays;

public class MoveZeros {

    public static void End(int[] ia) {
        int counter = 0;
        for (int i = 0; i <= ia.length - 1; i++) {
            if (ia[i]!=0) {
                    ia[counter] = ia[i];
                counter++;
            }
        }
        for (int i = counter + 1; i <= ia.length - 1; i++) {
            ia[i] = 0;
        }
        System.out.println(Arrays.toString(ia));
    }

    public static void Start(int[] ia) {
        int counter=ia.length-1;

        for (int i=ia.length-1;i>=0;i--) {
            if (ia[i]!=0) {
                ia[counter] = ia[i];
                counter--;
            }
        }
        while(counter>=0){
            ia[counter]=0;
            counter--;
        }
        System.out.println(Arrays.toString(ia));
    }

    public static void main(String[] args) {
        int[] ia = {0, 1, 0, 0, 0, 5, 8, 7, 5};

        MoveZeros.End(ia);
        //MoveZeros.Start(ia);
    }
}