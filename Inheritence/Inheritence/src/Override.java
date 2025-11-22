class Super {
    public void display() {
        System.out.println("Super Display");
    }
}

class Sub extends Super {

    public void display() {
        System.out.println("Sub Display and Super class's implementation is Shadowed");
    }
}

public class Override {
    public static void main(String[] args) {
        Super s = new Sub();
        s.display();

    }
}