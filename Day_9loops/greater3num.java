import java.util.Scanner;

public class greater3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a > b) && (a > c)) {
            System.out.println(a + "is the greater number");

        } else if ((a < b) && (b > c)) {
            System.out.println(b + "is the greater number");

        } else {

            System.out.println(c + "is the greater number");
        }
        sc.close();
    }
}
