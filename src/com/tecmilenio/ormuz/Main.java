package com.tecmilenio.ormuz;

public class Main{

    public static void main(String[] args) {
        // Error
        Shape shape = new Shape() {
            @Override
            public double area() {
                return 0;
            }

            @Override
            public double perimeter() {
                return 0;
            }
        };
        System.out.println(shape.area());
        System.out.println(shape.perimeter());
        // Comentar para continuar con la ejecucion

        Circle circle = new Circle(5);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());

        Square square = new Square(10);
        System.out.println(square.area());
        System.out.println(square.perimeter());

        EquilateralTriangle triangle = new EquilateralTriangle(10);
        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());

        Rectangle rectangle = new Rectangle(9,4);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
    }

}
