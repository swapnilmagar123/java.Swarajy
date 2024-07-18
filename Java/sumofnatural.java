import java.util.Scanner;

public class sumofnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int formula = (number * (number + 1)) / 2;
        System.out.println(formula);
        sc.close();

    }
}
