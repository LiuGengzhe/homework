package cn.tedu.homework;

import java.util.Stack;

public class JinZhiZhuanHua {
    public static void main(String[] args) {
        zhuanHuan(14,16);
    }
//    private static void BinaryConversion(Integer a, Integer b) {
//
//        Stack stack = new Stack();
//
//        while (a != 0){
//
//            stack.push(a%b);
//
//            a=a/b;
//
//        }
//
//        while (!stack.empty()){
//
//            System.out.print(stack.pop());
//
//        }
//
//    }

    public static void zhuanHuan(Integer in,Integer target){
        if (null == in){
            return;
        }
        Stack<Integer> s = new Stack<>();
        int rem;
        int res;
        while(in != 0){
            res = in/target;
            rem = in%target;
            in = res;
            s.push(rem);
//            if (in == 0){
//                break;
//            }
        }
        while(!s.isEmpty()){

            int i = s.pop();
            char c='a';
            if (i>=10){
                switch (i) {
                    case 10:
                        c = 'A';
                        break;
                    case 11:
                        c = 'B';
                        break;
                    case 12:
                        c = 'C';
                        break;
                    case 13:
                        c = 'D';
                        break;
                    case 14:
                        c = 'E';
                        break;
                    case 15:
                        c = 'F';
                        break;
                }
                System.out.print(c);
            }else {
                System.out.print(i);
            }
        }

    }
}
