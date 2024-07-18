import java.util.Scanner;

public class logical_operstor {
    public static void main(String[] args) {
        Scanner king = new Scanner(System.in);
        System.out.println((5 < 10) && (4 < 6));
        System.out.println((15 < 10) || (41 < 6));
        System.out.println((51 != 5));
        king.close();
    }
}
