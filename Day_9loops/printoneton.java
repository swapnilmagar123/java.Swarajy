import java.util.Scanner;

public class printoneton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that you want to print");
        int a = sc.nextInt();
        int counter = 1;
        while (counter <= a) {

            System.out.println(counter);
            counter++;
            sc.close();
        }
    }
}
