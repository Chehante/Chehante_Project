package Lesson5.Geometry;

public class Square extends Rectangle{

    public Square(Point a, Point b, Point c, Point d){
        super(a, b, c, d);
    }

    public double getSquare(){
        double ab = Point.getLengthOfSection(a, b);
        return Math.pow(ab, 2);
    }

    public double getPerimeter(){
        double ab = Point.getLengthOfSection(a, b);
        return 4 *(ab);
    }

}
