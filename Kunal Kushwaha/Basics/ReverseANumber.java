import java.util.*;
public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // while(num>0){
        //     int rem = num%10;
        //     System.out.print(rem);
        //     num/=10;
        // }
        int ans = 0;
        while(num>0){
           int rem = num%10;
           ans = ans*10+rem;
           num/=10;
        }
        System.out.println(ans);
    }
}
