public class Main {
    public static  void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.height = 5;
        c1.radius = 6;
        System.out.println(c1.area());
        System.out.println(c1.volume());
    }
}

class Circle {
    public double radius;

    public double area() {

        return Math.PI * radius * radius;
    }

    public double perimeterCircle() {
        return 2 * Math.PI * radius;
    }
}

class Cylinder extends Circle {
    public double height;

    public double volume() {
        return area() * height;
    }

    public double perimeterCylinder() {
        return perimeterCircle() * height;
    }
}