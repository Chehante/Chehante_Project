package HomeWork.Lesson4;

public class Circle {

    int rad;
    Point centr;

    public Circle(Point a, int b){
        centr = a;
        rad = b;
    }

    public void getSquare(){
        System.out.println("Площадь круга с радиусом: " + rad + " составляет " + Math.PI * Math.pow(rad, 2));
    }

    public void getPerimeter(){
        System.out.println("Длина окружности с радиусом: " + rad + " составляет " + 2 * Math.PI * rad);
    }
}
