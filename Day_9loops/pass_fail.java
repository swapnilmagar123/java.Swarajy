import java.util.Scanner;

public class pass_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of enlish");
        int english = sc.nextInt();
        System.out.println("Enter the marks of marathi");
        int marathi = sc.nextInt();
        System.out.println("Enter the marks of biogoly");
        int biology = sc.nextInt();
        System.out.println("Enter the marks of physics");
        int physics = sc.nextInt();
        System.out.println("Enter the marks of chemistry");
        int chemisrty = sc.nextInt();
        float avg = (english + marathi + biology + physics + chemisrty) / 5;
        System.out.println("The percentage of the student " + avg);

        if (avg > 35) {
            System.out.println("the student is passed");

        } else {
            System.out.println("student is failed");
        }
        sc.close();
    }
}
