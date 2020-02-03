package LeetCode;

public class Strings_InSentenceReversed {
    public static void main(String[] args) {
        System.out.println(reverseWords("you are awesome"));
    }

    public static String reverseWords(String s) {
        String[] sa= s.split(" ");
        StringBuffer sb=new StringBuffer();

        for(String word:sa){
            StringBuffer bs=new StringBuffer(word).reverse();
            sb=sb.append(bs).append(" ");
        }

        return sb.toString();

    }
}
