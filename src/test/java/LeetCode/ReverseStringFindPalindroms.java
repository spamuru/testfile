package LeetCode;

import java.util.Arrays;

public class ReverseStringFindPalindroms {
    public static void main(String[] args) {
        String s = "Tests on moom done by mom";
        String[] sa=s.split(" ");
        String a="";
        for (String ss:sa) {
            StringBuffer sb=new StringBuffer(ss);
           if(sb.reverse().toString().equals(ss)){
               System.out.println(ss+"found palindrome");
           }
           a= ss+" "+a;

        }
        System.out.println(a);

        char[] ca={'a','e','i'};
        char[] fa={'a','e','i'};
        System.out.println(Arrays.equals(ca,fa));
    }
}
