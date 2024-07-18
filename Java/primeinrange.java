import java.util.Scanner;

public class primeinrange {
    public static void main(String[] args) {
        int i;
        int flag = 0;
        System.out.println("Enter the lower ranger for the prime number");
        int number = sc.nextInt();
        System.out.println("Enter the lower ranger for the prime number");
        int number2 = sc.nextInt();
        for (i = number; i <= number2; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }

            if (flag == 1) {
                System.out.println(i);
            }
            sc.close();
        }
    }
}
