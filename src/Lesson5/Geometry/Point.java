package Lesson5.Geometry;

public class Point {

    int x;
    int y;

    //конструктор
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static double getLengthOfSection(Point a, Point b){

        return Math.sqrt((Math.pow((a.x - b.x),2) + Math.pow((a.y - b.y),2)));

    }

}
