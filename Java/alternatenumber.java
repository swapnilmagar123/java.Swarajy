import java.util.Scanner;

public class alternatenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i = i + 2) {
            System.out.println(i);

        }
        sc.close();
    }
}
