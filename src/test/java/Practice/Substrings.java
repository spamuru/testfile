package Practice;

public class Substrings {
    public static void main(String args[]){
        String s= "testscore";
        StringBuffer sb = new StringBuffer(s);
        //System.out.println(sb.replace(2,4,"z"));
       // System.out.println(s.replace('e','r'));
       // System.out.println(s.substring(1));
      //  System.out.println(s.substring(0));
        Substrings ss = new Substrings();
        System.out.println(ss.recurseString(s));
//        System.out.println(s.substring(0,1)); //→ it gives t
//        System.out.println(s.substring(0,0));// → it gives nothing
//        System.out.println(s.substring(0,8));// → it gives testscor
//        System.out.println(s.substring(0,9));// → it gives testscore
//        System.out.println(s.length ());//
//        System.out.println (s.charAt (7));
       // because String is terminated by \0
        String g="sudhalakshmipamuru";
        String f="";

//        System.out.println (g.concat(s));
//        System.out.println (g.contains ("su"));
//        System.out.println (g.contentEquals ("sudhalakshmipamuru"));
//        System.out.println (g.endsWith ("uiru"));
//        System.out.println (g.equals (g));
//        System.out.println (g.indexOf ('a', 5));
        System.out.println (f.isEmpty());
       System.out.println (g.substring(g.length()-2)+"#####");
        System.out.println (g.substring(g.length()-18));
        System.out.println(g.replaceAll(" ", ""));
        System.out.println(g.replace('s','h'));
        System.out.println(g.split(" "));

    }

    public String recurseString(String str){
        if(str.length()<=1){
            return str;
        }
        else{
            return recurseString(str.substring(1))+ str.charAt(0);
        }

    }
}
