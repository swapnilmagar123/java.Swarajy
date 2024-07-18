public class sumofnatural {
    public static int addtion(int n) {
        if (n == 1) {
            return 1;
        }
        int num2 = n + addtion(n - 1);
        return num2;
    }

    public static void main(String[] args) {
        System.out.println(addtion(10));
    }
}
