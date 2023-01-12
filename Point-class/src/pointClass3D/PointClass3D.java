package pointClass3D;

import pointClass2D.PointClass2D;

import java.util.Arrays;

public class PointClass3D extends PointClass2D {
    private float z = 0.0f;

    public PointClass3D() {

    }

    public PointClass3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(),getZ()};
    }

    @Override
    public String toString() {
        return "Point3D: " +
                " x = "+getX()+
                ", y = "+getY()+
                ", z = " + z +
                ", Array of: "+Arrays.toString(getXYZ());
    }
}
