package run;

import pointClass2D.PointClass2D;
import pointClass3D.PointClass3D;


public class Main {
    public static void main(String[] args) {
        PointClass2D pointClass2D = new PointClass2D(5,10);
        System.out.println(pointClass2D);
        PointClass3D pointClass3D = new PointClass3D(pointClass2D.getX(), pointClass2D.getY(), 15);
        System.out.println(pointClass3D);
    }
}