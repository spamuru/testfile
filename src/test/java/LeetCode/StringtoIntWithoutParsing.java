package LeetCode;

public class StringtoIntWithoutParsing {
    public static void main(String[] args) {
        String one = "5535678";
        String two = "55";

        int f=55;
        String r = new Integer(f).toString();

        StringtoIntWithoutParsing.oneString(one);
        StringtoIntWithoutParsing.addTwoStrings(one,two);
    }

    public static void oneString(String s){
        char[] ca = s.toCharArray();
        int zeroAscii = (int)'0';
        int x=0;

        for(int i=0;i<=ca.length-1;i++)
        {
            x=x*10+ca[i]-zeroAscii;
        }
        System.out.println(x);
    }

    public static void addTwoStrings(String num1, String num2){

        int x=0,y=0;
        for(int i=0,j=0; i<=num1.length()-1 || j<=num2.length()-1;j++,i++){

            if(!(i>=num1.length())){
                x=x*10;
                char c = num1.charAt(i);
                x=x + (int)c - (int)'0';
            }
            if(!(j>=num2.length())){
                y=y*10;
                char d = num2.charAt(j);
                y=y + (int)d - (int)'0';
            }

        }
        System.out.println(x+y);

    }
}
