import java.util.Scanner;

public class reverseandcheckpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here");
        int number = sc.nextInt();
        int sum = 0;
        int m = number;
        while (number > 0) {
            int r = number % 10;
            sum = sum * 10 + r;
            number = number / 10;
        }
        System.out.println(sum);
        if (sum == m) {
            System.out.println("this is palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
        sc.close();
    }
}
