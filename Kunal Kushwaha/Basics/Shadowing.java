public class Shadowing {
    // kinda global
    // static is used because it will be used inside psvm -> static should be used
    // inside static
    static int x = 90;

    public static void main(String[] args) {
        System.out.println(x);
        // int x;
        // System.out.println(x); //gives error bcz it only declared not initialized,
        // without initializing we can;t able to use
        // x = 40;
        int x = 40;
        System.out.println(x);
        fun();
    }

    public static void fun() {
        System.out.println(x);
    }
}
