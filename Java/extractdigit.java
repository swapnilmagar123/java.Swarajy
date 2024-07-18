import java.util.Scanner;

public class extractdigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number here");
        int number = sc.nextInt();
        int counter = 0;
        int a;
        int number2;
        number2 = number;
        while (number > 0)

        {
            number = number / 10;
            counter++;
        }
        while (number2 > 0)

        {
            a = number2 % 10;
            System.out.println("The postition of the digit number " + counter + " is " + a);
            number2 = number2 / 10;
            counter--;
        }
        sc.close();
    }
}
