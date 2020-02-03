package LeetCode;

import java.util.Scanner;

public class StairCase {
       /* public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("number??");
            int num  = Integer.parseInt(sc.nextLine());
            for(int j=0;j<num;j++){
                for(int i=1;i<=num;i++){
                    System.out.print(i<num-j?" ":"#");
                }
                System.out.println("");
            }
        }*/

    public static void main(String[] args) {

        int k=5;
            String s = " ";
            int space=k;
            for (int i=0;i<=k;i++){
                while(space>0){
                    System.out.println(s);
                    space --;
                }

                int j=i;
                while(j>0){
                    System.out.println("#");
                    j--;
                }
                System.out.println("-ln");
            }

    }
}


