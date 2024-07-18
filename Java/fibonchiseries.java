import java.util.Scanner;

public class fibonchiseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 1;

        for (int i = 1; i <= number; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a + " ");
        }

        sc.close();
    }
}
