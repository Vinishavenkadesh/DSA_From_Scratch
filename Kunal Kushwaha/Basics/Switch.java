import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        fruit = fruit.toLowerCase();
        switch (fruit) {
            case "mango":
                System.out.println("King of fruit");
                break;
            case "apple":
                System.out.println("Apple is so sweet");
                break;
            case "grapes":
                System.out.println("I love Grapes");
                break;
            case "orange":
                System.out.println("Orange is healtier");
                break;
            default:
                System.out.println("Your fruit name is not available");
                break;
        }
    }
}

// import java.util.*;

// public class Switch {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String fruit = sc.next();
//         fruit = fruit.toLowerCase();
//         switch (fruit) {
//             case "mango" -> System.out.println("King of fruit");
//             case "apple" -> System.out.println("Apple is so sweet");
//             case "grapes" -> System.out.println("I love Grapes");
//             case "orange" -> System.out.println("Orange is healtier");
//             default -> System.out.println("Your fruit name is not available");
//         }
//     }
// }