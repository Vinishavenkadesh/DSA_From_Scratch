import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
        sum(1, 4, 5, 7, 8);
        // int ans = sum(12, 45, 98);
        int ans = sum(12, 45);
        System.out.println(ans);
    }
    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    static int sum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }
    static void sum(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
