import java.util.*;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = isPrime(num);
        System.out.println(ans);
    }

    private static boolean isPrime(int num) {
        int flag = 1;
        int c = 2;
        if (num == 0 || num == 1)
            return false;
        else if (num % 2 == 0)
            return false;
        else
            while (c * c <= num) {
                if (num % c == 0) {
                    return false;
                }
                c++;
            }
        if (c * c > num)
            return true;
        return false;
    }
}
