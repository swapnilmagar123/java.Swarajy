import java.util.Scanner;

public class farainhate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temp in the faraihate");
        double faraihate = sc.nextDouble();
        double cenlious = (faraihate - 32) * (0.5556);
        System.out.println("the censilous is " + cenlious);
        sc.close();

    }

}
