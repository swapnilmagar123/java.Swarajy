import java.util.Scanner;

public class product2 {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = multiply(a, b);
        System.out.println(k);

        sc.close();
    }
}
