public class Opps {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.color = "blue";
        System.out.println(p1.color);
    }
}

class pen {
    String color;
    int tip;

    void Setcolor(String Newcolor) {
        color = Newcolor;
    }

    void Settip(int Newtip) {
        tip = Newtip;
    }
}
