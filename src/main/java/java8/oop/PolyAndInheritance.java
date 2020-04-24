package java8.oop;

public class PolyAndInheritance {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        s.test(20);

        s = new Rectangle();
        s.draw();
        s.test(30);
    }
}

abstract class Shape {
    private int a = 10;

    abstract void draw();

    void test(int b) {
        System.out.println(a + b);
    }
}

class Circle extends Shape {
    // inheritance == > its a process in which child class is able to inherit the methods from the parent class
    @Override
    void draw() {
        System.out.println("Cicle Drawn");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Rec Drawn");
    }
}