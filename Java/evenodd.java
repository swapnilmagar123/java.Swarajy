import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is a even number");
        } else {
            System.out.println("The number " + number + " is a odd number");
        }
        sc.close();
    }
}
