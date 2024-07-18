public class stringbuilder2 {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("  ");
        for (char a = 'a'; a <= 'z'; a++) {
            sc.append(" " + a);

        }

        System.out.println(sc);
    }

}
