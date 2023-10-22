import java.util.*;
public class CountingOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numToCount = sc.nextInt();
        int count = 0;
        while(num>0){
            int rem = num%10;
            if(rem==numToCount)
            count += 1;
            num/=10;
        }
        System.out.println(count);
    }
}
