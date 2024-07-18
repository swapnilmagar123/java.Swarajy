import java.util.Scanner;

public class greater2num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            System.out.println(b + " this is the greater number ");
        } else {
            System.out.println(a + "This is the smallest number");
        }
        sc.close();
    }
}
