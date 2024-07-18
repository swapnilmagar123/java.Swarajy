import java.util.Scanner;

public class conditonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("you are not eligible for the driving");
        } else {
            System.out.println("you are  eligible for the driving");
        }
        sc.close();

    }
}
