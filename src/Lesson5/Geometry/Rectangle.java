package Lesson5.Geometry;

public class Rectangle extends Shape{

    Point b;
    Point c;
    Point d;

    public Rectangle (Point a, Point b, Point c, Point d){
        super(a);
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getSquare(){
        double ab = Point.getLengthOfSection(a,b);
        double bc = Point.getLengthOfSection(b,c);
        return ab*bc;
    }

    public double getPerimeter(){
        double ab = Point.getLengthOfSection(a,b);
        double bc = Point.getLengthOfSection(b,c);
        return 2*(ab+bc);
    }

}
