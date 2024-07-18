public class overloading {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // this is the method overloading meands fuction or method with the same name of
    // fuction with the different pararmenter
    public static void main(String[] args) {
        System.out.println(sum(4, 5, 6));
        System.out.println(sum(3, 4));
    }
}
