package LeetCode;

import java.util.HashSet;
import java.util.LinkedList;

public class IntersectionArray {
    public static int[] intersect(int[] nums1, int[] nums2) {
        LinkedList<Integer> set1 = new  LinkedList<Integer>();
        LinkedList<Integer> set2 = new  LinkedList<Integer>();

        for(int n:nums1){
            set1.add(n);
        }
        for(int n:nums2){
            set2.add(n);
        }

        set1.retainAll(set2);
        int[] ia=new int[set1.size()];
        int m=0;
        for(int x:set1){
            ia[m]=x;
            m++;
        }
        return ia;
    }

    public static void main(String[] args) {
        int[] a={1,2,2,4};
        int[] a1={2,2};
        int[] s = IntersectionArray.intersect(a,a1);
        for(int i:s){
            System.out.println(i);
        }
    }
}
