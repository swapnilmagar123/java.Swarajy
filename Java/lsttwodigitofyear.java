import java.util.Scanner;

public class lsttwodigitofyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year here");
        int year = sc.nextInt();
        if (year > 0) {
            year = year % 100;
        }
        System.out.println("The last two digit are " + year);
        sc.close();
    }
}
