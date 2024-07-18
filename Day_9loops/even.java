import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(a + " is the even number");
        } else {
            System.out.println("the number is not even");
        }
        sc.close();
    }
}
