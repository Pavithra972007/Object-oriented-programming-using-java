import java.util.Scanner;

abstract class Shape {
    int a, b;

    Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract void printArea();
}

class Rectangle extends Shape {

    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void printArea() {
        System.out.println("Area of Rectangle = " + (a * b));
    }
}

class Triangle extends Shape {

    Triangle(int base, int height) {
        super(base, height);
    }

    void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * a * b));
    }
}

class Circle extends Shape {

    Circle(int radius) {
        super(radius, 0);
    }

    void printArea() {
        System.out.println("Area of Circle = " + (3.14 * a * a));
    }
}

public class Ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length and Breadth of Rectangle: ");
        int l = sc.nextInt();
        int br = sc.nextInt();

        System.out.print("Enter Base and Height of Triangle: ");
        int base = sc.nextInt();
        int height = sc.nextInt();

        System.out.print("Enter Radius of Circle: ");
        int r = sc.nextInt();

        Shape s1 = new Rectangle(l, br);
        Shape s2 = new Triangle(base, height);
        Shape s3 = new Circle(r);

        s1.printArea();
        s2.printArea();
        s3.printArea();

        sc.close();
    }
}









