import java.util.Scanner;

public class char_at {
    public static void string(String str1) {
        for (int i = 0; i <= str1.length(); i++) {
            System.out.print(str1.charAt(i));

        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string here");
        String str1 = sc.nextLine();

        string(str1);
        sc.close();
    }
}
