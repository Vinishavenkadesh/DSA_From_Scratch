public class BlockScope {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        {
            // int a = 50; //if it is initizilated outside of the block we can only modify
            // it and can't be initialized(error)
            int c = 50;
            a = 100;
            // it will change the original value of the reference
            System.out.println(a);
        }
        // c = 30; //if it is initialized inside of the block it can't be accessed
        // outside;(error)
        System.out.println(a);
    }
    

}
