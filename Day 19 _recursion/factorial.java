public class factorial {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        // int kin = fact(n - 1);
        int swap = n * fact(n - 1);
        return swap;

    }

    public static void main(String[] args) {
        System.out.println("this is the factorial of " + fact(5));
    }
}
