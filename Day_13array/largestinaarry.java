// import java.until.*;

public class largestinaarry {
    public static int getlargest(int number[]) {
        int num1 = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {

            if (num1 < number[i]) {
                num1 = number[i];
            }

        }
        return num1;
    }
    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("the largest value is " + getlargest(number));
    }

}
