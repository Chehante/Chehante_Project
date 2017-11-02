package HomeWork.Lesson4;

public class Three_Figures {

    public static void main(String[] args){

        circle();

        rectangle();

        triangle();

    }

    //работаем с кругом
    public static void circle(){

        Point centerOfCircle = new Point(3,4);
        int radius = 5;

        Circle crcl = new Circle(centerOfCircle, radius);
        crcl.getSquare();
        crcl.getPerimeter();

    }

    //работаем с прямоугольником
    public static void rectangle(){

        Point a = new Point(3,4);
        Point b = new Point(3,8);
        Point c = new Point(5,8);
        Point d = new Point(5,4);

        Rectangle rctngl = new Rectangle(a, b, c, d);
        rctngl.getSquare();
        rctngl.getPerimeter();

    }

    //работаем с прямоугольником
    public static void triangle(){

        Point a = new Point(3,4);
        Point b = new Point(3,8);
        Point c = new Point(5,8);

        Triangle trngl = new Triangle(a, b, c);
        trngl.getSquare();
        trngl.getPerimeter();

    }
}
