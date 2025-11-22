class Parents {
    Parents() {
        System.out.println("Non-Param of parent");
    }

    Parents(int x) {
        System.out.println("Param of parent " + x);
    }
}

class Childs extends Parents {
    Childs() {
        System.out.println("Non-Param of child");
    }

    Childs(int y) {
        System.out.println("Param of child");
    }

    Childs(int x, int y) {
        super(x);
        System.out.println("2 param of child " + y);
    }
}

public class SuperConstr {

    public static void main(String[] args) {
        //Child c=new Child();
        //Child c=new Child(20);
        Childs c = new Childs(10, 20);
    }

}