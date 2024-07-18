import java.util.Scanner;

public class opertaters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float sum = (a + b);
        float subtraction = (a - b);
        float product = (a * b);
        float division = (a / b);
        float remainder = (a % b);
        System.out.println("the sum of two number is " + sum);
        System.out.println(product);
        System.out.println(subtraction);
        System.out.println(division);
        System.out.println(remainder);
        sc.close();

    }

}
