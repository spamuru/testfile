package LeetCode;

public class HappyNumber {

    public static boolean isHappyw(int n) {
        if(n==0) {return false;}
        while(n>1){
            int y=0;
            while(n>0){
                y=y+(n%10)*(n%10);
                n=n/10;
            }
            if(y==1){return true;}
            if(y==4){return false;}
            n=y;
        }

        return true;
    }

    public static int isHappy(int n) {
        if (n == 0) {
            return 0;
        }

        int x = 0;
        int y = 0;
        while (n > 0) {
            x = (n % 10);
            y += x * x;
            n=n/10;
        }
        return y;
    }

    public static void main(String[] args) {
        int z = 19;
        System.out.println(HappyNumber.isHappyw(z));

        /*while ((z != 1) && (z != 4)) {
            z = HappyNumber.isHappy(z);
        }

        if (z == 1) {
            System.out.println("happy");
        } else {
            System.out.println("Not happy");
        }*/
    }
}