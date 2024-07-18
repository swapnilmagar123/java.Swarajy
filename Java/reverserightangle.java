import java.util.Scanner;

public class reverserightangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = number; j >= i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
