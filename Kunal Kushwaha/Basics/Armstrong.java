import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        for (int i = 1000; i < 10000; i++) {
            armstrong(i);
        }
        // System.out.println(armstrong(num));
    }

    static int countingDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    // static boolean armstrong(int num) {
    // int value = num;
    // int rem = 0;
    // int count = countingDigits(num);
    // while (num > 0) {
    // rem += Math.pow((num % 10), count);
    // num /= 10;
    // }
    // if (rem == value)
    // return true;
    // else
    // return false;
    // }

    static void armstrong(int num) {
        int value = num;
        int rem = 0;
        int count = countingDigits(num);
        while (num > 0) {
            rem += Math.pow((num % 10), count);
            num /= 10;
        }
        if (rem == value)
            System.out.println(rem);
    }
}
