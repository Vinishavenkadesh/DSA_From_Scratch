import java.util.*;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Empid = sc.nextInt();
        String dept = sc.next().toUpperCase();
        switch (Empid) {
            case 1 -> System.out.println("Isha");
            case 2 -> System.out.println("Vineetha");
            case 3 -> {
                System.out.println("Vineetha Rohit");
                switch (dept) {
                    case "IT" -> System.out.println("It Department");
                    case "ECE" -> System.out.println("ECE Department");
                    case "EEE" -> System.out.println("EEE Department");
                    default -> System.out.println("Enter other department");
                }
            }
            default -> System.out.println("Enter the correct Id");
        }
    }
}
