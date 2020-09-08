package cn.tedu.homework;

public class StringPicture {
    public static void main(String[] args) {
        String p1 ="12 3 .24653.png";
        String[] s = p1.split("\\.");
        for(String data:s){
            System.out.println(data);
        }
//        System.out.println(s.length);
        if(s[s.length-1].equals("png")||s[s.length-1].equals("jpg")||s[s.length-1].equals("jpeg")){
            long l = System.currentTimeMillis();
//            System.out.println(l);
            p1 = String.valueOf(l)+"."+s[s.length-1];
            System.out.println(p1);
        }
    }
}
