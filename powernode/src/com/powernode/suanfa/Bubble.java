package com.powernode.suanfa;

public class Bubble {
    public Bubble() {
    }
    public static void bubble(int[] a){
        if(null == a|| a.length <2)
            return;
        for(int i = a.length-1;i > 0;i--){
            for (int j = 0;j < i;j++){
                if (a[j]>a[j+1]){
                    int temp;
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
