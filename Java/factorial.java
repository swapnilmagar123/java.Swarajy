import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here");
        int number = sc.nextInt();
        int product = 1;
        for (int i = 1; i <= number; i++) {
            product = product * i;
        }
        sc.close();
        System.out.println("the factorial of the " + number + " is " + product);
    }
}
