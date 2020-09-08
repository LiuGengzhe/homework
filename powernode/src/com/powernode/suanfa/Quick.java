package com.powernode.suanfa;

public class Quick {
    public Quick() {
    }
    public static void quick(int[] a){
        if(null == a|| a.length < 2)
            return;
        int min;
        for(int i = 0;i<a.length-1;i++){
            min = i;
            for(int j = i + 1;j<a.length;j++){
                if (a[j]<a[min]){
                    min = j;
                }
            }
                if(min != i){
                    int temp;
                    temp = a[i];
                    a[i] = a[min];
                    a[min] = temp;
                }
        }
    }
}
