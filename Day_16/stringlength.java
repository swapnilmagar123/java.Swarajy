import java.util.Scanner;

public class stringlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string here");
        String swapnil = sc.nextLine();
        System.out.println(" this is the length of the stirng" + swapnil.length());
        sc.close();
    }
}
