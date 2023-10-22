import java.util.*;
public class Salary{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=10000){
            a = a + 2000;
            System.out.println(a);
        }
        else{
            a = a + 1000;
            System.out.println(a);
        }
    }
}