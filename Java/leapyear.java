import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the year here");
        int year = Sc.nextInt();
        int flag = 0;
        if (year % 4 == 0) {
            flag = 0;
        } else if ((year % 400 == 0) && (year % 100 == 0)) {
            flag = 0;
        } else {
            flag = 1;
        }
        if (flag == 0) {
            System.out.println("this year leap year");
        } else {
            System.out.println("This is not a leap year");
        }
        Sc.close();
    }
}
