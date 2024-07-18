public class dectobin {
    public static void decimalnum(int n) {
        int pow = 0;
        int binum = 0;
        while (n > 0) {
            int rem = n % 2;
            binum = binum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("the binary number is " + binum);
    }

    public static void main(String[] args) {
        decimalnum(7);
    }

}
