import java.util.Scanner;

public class swaping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Before swapping");
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("After swaping");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
        sc.close();
    }
}
