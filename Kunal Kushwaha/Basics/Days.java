import java.util.*;
public class Days {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    // switch(a){
    //   case 1:
    //   case 2:
    //   case 3:
    //   case 4:
    //   case 5:
    //   System.out.println("Week days");
    //   break;
    //   case 6:
    //   case 7:
    //   System.out.println("Happy Weekend");
    //   break;
    //   default:
    //   System.out.println("Please enter the number between 1 - 7");
    //   break;
    // }
    switch(a){
        case 1,2,3,4,5 -> System.out.println("Week Days");
        case 6,7 -> System.out.println("Happy Weekend");
        default -> System.out.println("Please enter the number between 1 - 7");
    }
    }
   } 
