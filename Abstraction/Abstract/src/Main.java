abstract class Super{
        public void meth1(){
            System.out.println("meth1 from super");
        }

         abstract void meth2();
        }
class sub extends Super{

    @Override
    void meth2() {
        System.out.println("meth2 is abstract");
    }
}
public class Main {
    public static void main(String[] args) {
        Super s=new sub();
        s.meth1();
        s.meth2();
    }
}