public class printoneton {
    public static void dec(int n) {
        if (n == 10) {
            System.out.println(10);
            return;
        }
        System.out.println(n + " ");
        dec(n + 1);

    }

    public static void main(String[] args) {
        int n = 1;
        dec(n);
    }
}
