import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 0 || a == 1)
            System.out.println("Neither prime nor composite");
        else if (a % 2 == 0)
            System.out.println("Not a Prime Number");
        else {
            int flag = 0;
            for (int i = 2; i < Math.sqrt(a); i++) {
                if (a % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                System.out.println("Not a Prime Number");
            else
                System.out.println("Prime Number");
        }
    }
}
