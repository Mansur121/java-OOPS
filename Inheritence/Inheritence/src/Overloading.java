public class Overloading {
    public static void main(String[] args) {
        Area a=new Area();
        a.area(2,8);
        a.area(4,5,6);
    }

    public static class Area{
        static void area(int l,int b){
            System.out.println(l*b);
        }
        static void area(int l,int b,int h){
            System.out.println(l*b*h);
        }
    }
}
