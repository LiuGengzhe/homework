package cn.tedu.homework;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void bubble(int[] o) {
        if(null == o||o.length<2)
            return;
        int i,j;
        for (i = o.length-1;i > 0;i--){
            for (j = 0;j < i;j++){
                if (o[j] > o[j+1]){
                    int temp;
                    temp = o[j];
                    o[j] = o[j+1];
                    o[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] i = new int[5];
        Random r = new Random();
        for(int x = 0;x<5;x++){
            i[x] = r.nextInt(101);
        }
        bubble(i);
        System.out.println(Arrays.toString(i));
    }
}
