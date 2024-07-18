public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();

    }
}
// this is the property of the inheritance and they will be implemented in the derived class of the java
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void fly() {
        System.out.println("fly");
    }

    void walk() {
        System.out.println("walk");
    }
}

class Fish extends Animal {
    int aaba;

    void sleep() {
        System.out.println("sleep");
    }
}