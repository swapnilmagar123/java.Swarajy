import java.util.Scanner;

public class righangle {
    public static void right(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - 1; j++) {
                System.out.print("  ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int row = sc.nextInt();
        System.out.println("Enter the number of col");
        int col = sc.nextInt();
        right(row, col);
        sc.close();
    }
}
