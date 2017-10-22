package Lesson5.Geometry;

import static java.lang.Math.sqrt;

public class Triangle extends Shape {

    Point b;
    Point c;

    public Triangle(Point a, Point b, Point c){
        super(a);
        this.b = b;
        this.c = c;
    }

    public double getSquare(){
        double ab = Point.getLengthOfSection(a,b);
        double bc = Point.getLengthOfSection(b,c);
        double ca = Point.getLengthOfSection(c,a);
        double halfPerimeter = (ab + bc + ca)/2;
        return Math.sqrt(halfPerimeter*(halfPerimeter-ab)*(halfPerimeter-bc)*(halfPerimeter-ca));
    }

    public double getPerimeter(){
        double ab = Point.getLengthOfSection(a,b);
        double bc = Point.getLengthOfSection(b,c);
        double ca = Point.getLengthOfSection(c,a);
        return ab + bc + ca;
    }


}
