package LeetCode;

import java.util.Map;

public class String_RemoveVowels {
    public static void main(String[] args) {
        String s = "jhakjaaajkkeklktlikjfojshkfuhksjhfkjsuhskojkjhekbkjeke";
        StringBuffer sb= new StringBuffer();
        for(int i=0;i<=s.length()-1;i++){
            switch (s.charAt(i)){
                case 'a':
                    break;
                case 'e':
                    break;
                case 'i':
                    break;
                case 'o':
                    break;
                case 'u':
                    break;
                default:
                    sb=sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
