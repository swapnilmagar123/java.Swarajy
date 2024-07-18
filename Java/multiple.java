import java.util.Scanner;

public class multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here");
        int number = sc.nextInt();
        for (int i = 0; i <= number; i = i + 5) {
            System.out.println(i);

        }
        sc.close();
    }
}
