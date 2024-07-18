import java.util.Scanner;

public class positve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("this is positive number");
        } else {
            System.out.println("this is the negative number");
        }
        sc.close();

    }
}
