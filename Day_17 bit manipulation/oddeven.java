public class oddeven {
    public static void oddoreven(int n) {
        int bit = 1;
        if ((n & bit) == 0) {
            System.out.println("this is the even number");
        } else {
            System.out.println("this is the odd number");
        }
    }

    public static void main(String[] args) {
        oddoreven(5);
        oddoreven(15);
        oddoreven(12);
    }
}
