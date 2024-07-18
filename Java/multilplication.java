import java.util.Scanner;

public class multilplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here");
        int a = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + "X" + i + " = " + i * a);
        }
        sc.close();
    }
}
