import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the Operator:");
            char ch = sc.next().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.println("Enter two value:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (ch == '+') {
                    int ans = a + b;
                    System.out.println(ans);
                } else if (ch == '-') {
                    int ans = a - b;
                    System.out.println(ans);
                } else if (ch == '*') {
                    int ans = a * b;
                    System.out.println(ans);
                } else if (ch == '/') {
                    int ans = a / b;
                    System.out.println(ans);
                } else if (ch == '%') {
                    int ans = a % b;
                    System.out.println(ans);
                }
            } else if (ch == 'x' || ch == 'X')
                break;
            else
                System.out.println("Please enter the valid operator!");

        }
    }
}
