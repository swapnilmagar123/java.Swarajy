import java.util.Scanner;

public class largesttwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        if ((a > b) && (a > c)) {
            System.out.println(a + "is the gretest number");
        } else if ((a < b) && (b > c)) {
            System.out.println(b + "is the gretest number");
        } else {
            System.out.println(c + " is the greatest number");
        }
        sc.close();
    }

