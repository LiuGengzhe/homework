public class Hello {
    public static void main(String[] args) {
//        System.out.println("HelloWorld");
        System.out.println(Thread.currentThread().getContextClassLoader().getResource("family.xml"));
    }

}
