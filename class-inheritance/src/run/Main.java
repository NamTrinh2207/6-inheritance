package run;

import Circle.Circle;
import Cylinder.Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0,"blue");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(circle.getRadius(), circle.getColor(), 5);
        System.out.println(cylinder);
    }
}