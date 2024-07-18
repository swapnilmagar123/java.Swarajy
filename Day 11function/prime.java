import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here");
        int b = sc.nextInt();
        boolean isprime = true;
        for (int i = 2; i <= b - 1; i++) {
            if (b % i == 0) {
                isprime = false;
            }

        }
        if (isprime == true) {
            System.out.println("this number is   prime number");

        } else {
            System.out.println("this is not  a prime number");
        }
        sc.close();
    }
}
