package LeetCode;

public class StringReverseInplace {
    public static void main(String[] args) {
        char[] ca={'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
        for (char c:ca) {
            System.out.print("'"+c+"'"+",");
        }
        System.out.println();
        ReverseString(ca);
    }
    public static void ReverseString(char[] ca){
       for(int i=0;i<=(ca.length)/2;i++){
           char temp = ca[i];
           ca[i]=ca[ca.length-(i+1)];
           ca[ca.length-(i+1)]=temp;
       }

        for (char c:ca) {
            System.out.print("'"+c+"'"+",");
        }
    }
}
