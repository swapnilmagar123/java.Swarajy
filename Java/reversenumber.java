import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        int r, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here");
        int number = sc.nextInt();
        while (number > 0) {
            r = number % 10;
            sum = sum * 10 + r;
            number = number / 10;
        }
        System.out.println(sum);
        sc.close();
    }
}
