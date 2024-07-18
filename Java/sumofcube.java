import java.util.Scanner;

public class sumofcube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + (int) Math.pow(i, 3);
        }
        System.out.println(sum);
        sc.close();
    }
}
