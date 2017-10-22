package Lesson5.Geometry;

import sun.security.provider.SHA;

public class Geometry {

    Shape shp;
    static Point a = new Point(1,1);
    static Point b = new Point(1,4);
    static Point c = new Point(3,4);
    static Point d = new Point(3,1);

    //constructor
    public Geometry(Shape x){
        shp = x;
    }

    public String getSquareAndPerimeter(){
       return  "Периметр - " + shp.getPerimeter() + "; площадь - " + shp.getSquare();
    }


    public static void main(String[] args) {

        Shape[] arrayOfShapes = new Shape[]{new Circle(a, 5), new Triangle(a, b, c), new Rectangle(a, b, c, d), new Square(a, b, c, d)};
        String[] annotations = new String[]{"Круг: ", "Треугольник: ", "Прямоугольник: ", "Квадрат: "};

        Geometry gmtr = new Geometry(null);


        for (int i = 0; i < 4; i++) {

            gmtr.shp = arrayOfShapes[i];
            System.out.println(annotations[i] + gmtr.getSquareAndPerimeter());

        }

    }
}
