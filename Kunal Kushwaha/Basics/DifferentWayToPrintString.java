import java.util.*;

public class DifferentWayToPrintString {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // First Method of Printing Array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Second Method of Printing Array
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Third Method of Printing Array
        System.out.println(Arrays.toString(arr));
    }
}
