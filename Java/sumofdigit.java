import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here");
        int number = sc.nextInt();
        int r;
        int sum = 0;
        while (number > 0) {
            r = number % 10;
            sum = sum + r;
            number = number / 10;
            sc.close();

        }
        System.out.println("The sum of digit is " + sum);
    }
}
