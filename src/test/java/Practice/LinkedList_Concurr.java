package Practice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Concurr {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("test1");ll.add("test2");ll.add("test3");ll.add("test4");ll.add("test5");
        /*Iterator<String> i = ll.iterator();
        while(i.hasNext()){
            String s =i.next();
            if (s.equalsIgnoreCase("test2"))
                ll.remove("test2");
        }*/

        for (int i=0;i<=ll.size();i++) {
            String s =ll.get(i);
            if (s.equalsIgnoreCase("test2")) {
                ll.remove("test2");
                i--;
            }
        }
        System.out.println(ll);
    }
}
