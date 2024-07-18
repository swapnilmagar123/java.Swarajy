import java.util.Scanner;

// perfect number is the addtion of the factor of the number
public class perfectnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number");
        int number = sc.nextInt();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }

        }
        if (sum == number) {
            System.out.println("this is the perfect number");
        } else {
            System.out.println("this is not a perfect number");
        }
        sc.close();
    }

}
