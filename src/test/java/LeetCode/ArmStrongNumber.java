package LeetCode;

public class ArmStrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(154));
    }
    public static boolean isArmstrong(int a){
        int armNum=0;int b=a;
        while(b>0){
            armNum = armNum+(b%10)*(b%10)*(b%10);
            b=b/10;
        }
        if (a==armNum){return true;} else {return false;}

    }


}
