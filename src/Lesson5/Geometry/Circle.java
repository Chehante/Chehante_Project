package Lesson5.Geometry;

public class Circle extends Shape {

    int rad;

    public Circle(Point x, int y){
        super(x);
        rad = y;
    }

    public double getSquare(){
        return  Math.PI * Math.pow(rad, 2);
    }

    public double getPerimeter(){
         return 2 * Math.PI * rad;
    }
}
