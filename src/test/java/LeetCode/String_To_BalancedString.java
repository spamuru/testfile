package LeetCode;

import java.util.LinkedList;
import java.util.List;

public class String_To_BalancedString {
    public static void main(String[] args) {
        String b = "RLRRLLLRR";
        List<String> lb = new LinkedList<String>();
        int R = 0;
        int L =0;
        for(int j=0;j<=b.length()-1;j++) {
            L = 0;
            R = 0;

            for (int i = j; i <= b.length() - 1; i++) {
                if (b.charAt(i) == 'R') {
                    R++;
                } else {
                    L++;
                }
                if (R == L) {
                    lb.add(b.substring(j, i + 1));
                }
            }
        }
        System.out.println(lb);
    }

}
