public class constructar {
    public static void main(String[] args) {
        Student sd = new Student("swapnil magar ");
        System.out.println(sd.name);
    }
}

class Student {
    String name;
    int roll;

    // this is the student constructar which has no return type and the same name as
    // the class and they will automaticaLLY called
    Student(String name) {
        this.name = name;
    }
}