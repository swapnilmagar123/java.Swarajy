import java.util.Scanner;

public class horizontal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 1; i <= number - 1; i++) {
            for (int j = number - 1; j >= i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
