import java.util.Scanner;

public class checkequal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number");
        int number2 = sc.nextInt();
        if (number1 == number2) {
            System.out.println("The number1 is equal to number2 ");
        } else {
            System.out.println("The number1 is not  equal to number2 ");
        }
        sc.close();
    }
}
