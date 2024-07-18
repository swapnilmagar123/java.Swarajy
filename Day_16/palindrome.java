import java.util.Scanner;

public class palindrome {
    public static boolean checkpalingrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sting here");
        String str = sc.nextLine();
        System.out.println(checkpalingrome(str));
        sc.close();
    }
}
