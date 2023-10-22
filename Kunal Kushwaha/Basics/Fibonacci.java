import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a);
        System.out.print(b);
        for(int i = 2;i<=num;i++){
            int c = a+b;
            System.out.print(c);
            a=b;
            b=c;
        }
        // int count = 2;
        // while(count<=num){
        //     int temp = b;
        //     b = b+a;
        //     a=temp;
        //     count++;
        // }
        // System.out.println(b);
    }
}