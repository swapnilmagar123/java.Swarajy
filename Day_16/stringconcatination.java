import java.util.Scanner;

public class stringconcatination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string here");
        String str1 = sc.nextLine();
        System.out.println("Enter the string here");
        String str2 = sc.nextLine();
        System.out.println(str1 + " " + str2);
        sc.close();
    }
}
