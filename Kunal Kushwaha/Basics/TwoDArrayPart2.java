import java.util.Arrays;

public class TwoDArrayPart2 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 3, 4, 5 }, { 1, 2, 3, 4, 5 } };

        // Method 1:
        for (int[] num : arr)
            System.out.println(Arrays.toString(num));
        System.out.println();

        // Method 2:
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++)
                System.out.print(arr[row][col] + " ");
            System.out.println();
        }
        System.out.println();

        // Method 3:
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

    }
}
