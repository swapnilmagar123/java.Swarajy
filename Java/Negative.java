import java.util.Scanner;

public class Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("The number " + number + " is the negative number");
        } else {
            System.out.println("The number " + number + " is the positive number");
        }
        sc.close();
    }
}
