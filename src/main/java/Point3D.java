import java.util.Arrays;

public class Point3D extends Point2D{
    float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z){
        x = super.getX();
        y = super.getY();
        z = this.z;
    }

    public float[] getXYZ(){
       float[] arrayXYZ = new float[3] ;
       arrayXYZ[0] = super.getX();
       arrayXYZ[1] = super.getY();
       arrayXYZ[2] = this.z;
        return arrayXYZ;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXYZ());
    }
}
