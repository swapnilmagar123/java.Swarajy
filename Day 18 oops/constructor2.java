public class constructor2 {
    public static void main(String[] args) {
        // Student sc = new Student();

        // student sc2 = new student("swapnil");
        // student sc3 = new student(123);
        // // sc.name = "swapnil ";
        // sc.roll = 123;

    }
}

class Student {
    int roll;
    String name;

    // this are the types of the constructor parameterised constructor,non
    // parameterised constructor
    Student() {
        System.out.println("this is the type of construcure");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}