import java.util.Scanner;

public class increamentdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number here");
        int number = sc.nextInt();
        int r;
        int a;
        int m = 0;

        while (number > 0) {
            r = number % 10;
            r++;
            m = m * 10 + r;
            number = number / 10;

        }
        number = m;
        m = 0;

        while (number > 0) {
            a = number % 10;
            m = m * 10 + a;
            number = number / 10;
        }
        System.out.println(m);
        sc.close();
    }
}
