import java.util.Scanner;

public class calcular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number here");
        int a = sc.nextInt();
        System.out.println("Enter the second number here");
        int b = sc.nextInt();
        System.out.println("press 1 for addtion");
        System.out.println("press 2 for subtraction");
        System.out.println("press 3 for multiplication");
        System.out.println("press 4 for division");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                int add = a + b;
                System.out.println(add);
                break;
            case 2:
                int sub = a - b;
                System.out.println(sub);
                break;
            case 3:
                int mul = a * b;
                System.out.println(mul);
                break;
            case 4:
                int div = a / b;
                System.out.println(div);
                break;

        }
        sc.close();
    }
}
