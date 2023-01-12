package run;

import moveablePoint.MoveablePoint;
import point.Point;

public class Main {
    public static void main(String[] args) {
        Point point =new Point(5.5f,10.5f);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint(point.getX(), point.getY(),1.0f,2.0f);
        System.out.println("moveablePoint: "+moveablePoint);
        System.out.println("Move: "+moveablePoint.move());
    }
}