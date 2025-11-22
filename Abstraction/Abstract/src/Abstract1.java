public class Abstract1 {
    public static void main(String[] args) {

    Shape s=new Circle();
    s.Peri();
    rectangle r=new rectangle();
    r.area();



    }
}
abstract class Shape{
    abstract void Peri();
    abstract void area();
}
class Circle extends Shape{

    double radius=5;
    @Override
    void Peri() {
        System.out.println("Perimeter of Circle is : " + 2*Math.PI*radius);
    }

    @Override
    void area() {
        System.out.println("Area of circle is : "+ Math.PI*radius*radius);
    }
}
class rectangle extends Shape{
       int l=4,b=6;
    @Override
    public void Peri() {
        System.out.println("Perimeter of Rectangle is : " + l+b);
    }

    @Override
    void area() {
        System.out.println("Perimeter of Circle is : " + l*b);
    }
}