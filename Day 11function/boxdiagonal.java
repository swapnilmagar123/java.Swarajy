import java.util.Scanner;

public class boxdiagonal {
    public static void rectanglr(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col || i == j) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row");
        int row = sc.nextInt();
        System.out.println("enter the row");
        int col = sc.nextInt();
        sc.close();
        rectanglr(row, col);
    }
}
