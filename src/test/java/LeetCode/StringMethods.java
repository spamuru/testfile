package LeetCode;

public class StringMethods {
    public static void main(String[] args) {
        String s = "TestMarathon";
        String ss="aaaaaaaaaaaaaaaaaaaa";
        char[] ca = ss.toCharArray();
        s.getChars(2,6,ca,3);
        System.out.println(ca);
        String[] sa=s.split("");
        System.out.println(sa[2]);

        StringBuffer sb =new StringBuffer("test");
        sb.insert(0,"f");

        System.out.println(sb);

    }
}
