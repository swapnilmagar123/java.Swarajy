import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " is the not odd number");
        } else {
            System.out.println("the number is  odd");
        }
        sc.close();
    }
}
