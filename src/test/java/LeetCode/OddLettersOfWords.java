package LeetCode;

public class OddLettersOfWords {
    public static void main(String[] args) {
        String[] sa = {"abc","defgh","ijklmno"};
        for(int i=0;i<= sa.length-1;i++){
            char ca[] = sa[i].toCharArray();
            for(int j=0;j<=ca.length-1;j=j+2){
                System.out.print(ca[j]+",");
            }
            System.out.println();
        }
    }
}
