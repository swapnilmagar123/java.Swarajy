public class methodoverloading {
    public static void main(String[] args) {
        Calcular calc = new Calcular();
        System.out.println(calc.sum(2, 3));
        System.out.println(calc.sum((float) 3, (float) 5));
        System.out.println(calc.sum(2, 3, 5));
    }
}

// methiod overloading is the actully lots of method are created with different
// types of parameterised
class Calcular {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

}
