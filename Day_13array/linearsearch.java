public class linearsearch {
    public static int linearsearche(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int key = 6;
        int index = linearsearche(number, key);

        if (index == -1) {
            System.out.println("not found the key");

        } else {
            System.out.println("we found the key at position " + index);
        }
    }
}
