package com.powernode.suanfa;

public class Half {
    public Half() {
    }

    public static int half(int[] a, int x) {
        int begin = 0;
        int end = a.length - 1;
        int mid;
        while (begin <= end) {
            mid = (begin + end) / 2;
            if (a[mid] == x) {
                return mid;
            } else if (a[mid] > x) {
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }

        return -1;

    }
}