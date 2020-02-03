package LeetCode;

import java.util.StringTokenizer;

public class SentenceRecursiveReverse {

    public static void main(String[] args) {
        SentenceRecursiveReverse a = new SentenceRecursiveReverse();
        System.out.println(SentenceRecursiveReverse.reverseString("today is a good day"));
    }

    public static String reverseString(String str){
        String s;
        StringTokenizer st = new StringTokenizer(str, (" "));
        //if(!st.hasMoreTokens())
        if(st.countTokens()<=1)
            return str+" ";
        else
        {
             s = st.nextToken()+" " ;
            System.out.println(s);
            return reverseString(str.replace(s,""))+ s;

        }

    }
}