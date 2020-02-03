package LeetCode;

import javax.management.StringValueExp;

public class Add_Strings {
    public static void main(String[] args) {
        String x="6913259244";
        String y="71103343";
        String s=addStrings(x,y);
        System.out.println(s);
    }
    public static String addStrings(String x,String y){
        StringBuffer sb=new StringBuffer();
        int carry=0;
        int i=x.length()-1,j=y.length()-1;
      while (i>=0|| j>=0|| carry>0){
          int t=0;
        if(i>=0) {
           t= x.charAt(i)-'0';
           i--;
        }
           if(j>=0) {
               t=t+ y.charAt(j)-'0';
               j--;
           }
           if(carry>0){
            t=t+carry;
           }
        sb=sb.insert(0,String.valueOf(t));
        }


        return sb.toString();
    }
}
