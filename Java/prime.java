import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number here");
        int number = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;

            } else {
                flag = true;
            }

        }
        if (flag == true) {
            System.out.println(number + "it is   a prime number");

        } else {
            System.out.println("this is not a prime number");
        }
        sc.close();
    }
}
