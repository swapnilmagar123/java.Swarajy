public class bintodec {

    public static void bint(int binum) {
        int pow = 0;
        int dec = 0;
        while (binum > 0) {
            int lastdgt = binum % 10;
            dec = dec + (lastdgt * (int) Math.pow(2, pow));
            pow++;
            binum = binum / 10;
        }
        System.out.println("the decimal number is " + dec);
    }

    public static void main(String[] args) {
        bint(111);
    }
}
