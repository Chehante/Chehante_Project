package HomeWork.Lesson4;

public class Triangle {

    Point a;
    Point b;
    Point c;

    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void getSquare(){
        double ab = getLengthOfSection(a,b);
        double bc = getLengthOfSection(b,c);
        double ca = getLengthOfSection(c,a);
        double halfPerimeter = (ab + bc + ca)/2;
        System.out.println("Площадь треугольника со сторонами: " + ab + ", " + bc + ", " + ca + " составляет " + Math.sqrt(halfPerimeter*(halfPerimeter-ab)*(halfPerimeter-bc)*(halfPerimeter-ca)));
    }

    public void getPerimeter(){
        double ab = getLengthOfSection(a,b);
        double bc = getLengthOfSection(b,c);
        double ca = getLengthOfSection(c,a);
        System.out.println("Периметр треугольника со сторонами: " + ab + ", " + bc + ", " + ca + " составляет " + ab + bc + ca);
    }

    public double getLengthOfSection(Point a, Point b){

        return Math.sqrt(Math.pow((a.x - b.x),2) + Math.pow((a.y - b.y),2));

    }

}
