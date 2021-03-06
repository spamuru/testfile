package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(IsomorphicStrings.isIsomorphic("eggf","addd"));

    }
    public static boolean isIsomorphic(String s, String t) {
        if(s==null||t==null)
            return false;

        if(s.length()!=t.length())
            return false;

        Map<Character, Character> map = new HashMap<>();

        Map<Character, Character> map2 = new HashMap();


        for(int i=0; i<s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(map.containsKey(c1)){
                if(map.get(c1) != c2)
                    return false;
            }else{
                if(map2.containsKey(c2)) {//if c2 is already being mapped
                    if(map2.get(c2) != c1) {
                        return false;
                    }
                }
                map.put(c1, c2);
                map2.put(c2, c1);
            }
        }
        return true;

    }
}
