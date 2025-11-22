public class Main {
    public static void main(String[] args) {
        methol q = new methol();
        q.display1();
        q.display2();
    }
}

interface Test {
    void display1();

    void display2();

}

class methol implements Test {

    @Override
    public void display1() {
        System.out.println("This is meth1");
    }

    @Override
    public void display2() {
        System.out.println("This is meth2");
    }
}
