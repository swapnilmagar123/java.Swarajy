import java.util.Scanner;

public class parameters {
    public static void addtonumber(int a, int b) {

        int sum = a + b;
        System.out.println("the sum of the number is " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        addtonumber(a, b);
        sc.close();
    }

}
