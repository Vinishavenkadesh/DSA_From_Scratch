import java.util.*;

class LeftRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < n; i++) {
            int temp = a[0];
            for (int j = 0; j < 4; j++) {
                a[j] = a[j + 1];
            }
            a[4] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}