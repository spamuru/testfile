package LeetCode;

public class IsPowerOfThree {
    public static void main(String[] args) {
        System.out.println(powerThree(2));
    }

    public static boolean powerThree(int n){
        if(n==0){return false;}
        while (n%3==0){
            n = n/3;
        }
        if(n==1){return true;}
        else {return false;}

    }
}
