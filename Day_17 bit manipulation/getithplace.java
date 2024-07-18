public class getithplace {
    public static int getplace(int n, int i) {
        // int n;
        int bit = 1 << i;
        if ((n & bit) == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {
        System.out.println(getplace(10, 3));
        ;
    }
}
