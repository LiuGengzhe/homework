package cn.tedu.homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Inversion {
    public static void inversion(int[] o){
        int left = 0;
        int right = o.length-1;
        int temp;
        while(left<right){
            temp = o[left];
            o[left] = o[right];
            o[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        inversion(a);
        System.out.println(Arrays.toString(a));
        
    }
}
