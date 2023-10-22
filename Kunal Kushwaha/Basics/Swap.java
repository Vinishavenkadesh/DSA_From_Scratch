public class Swap {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        swap(a,b);
        System.out.println(a + " " + b);
    }

    private static void swap(int a,int b) {
        int temp = a;
        a = b;
        b = temp;
        //only value of the reference will be send
        //copying the value only 
    }
}
