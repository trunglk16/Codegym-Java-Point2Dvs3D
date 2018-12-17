import java.util.Arrays;

public class Point2D {
    float x = 0.0f;
    float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        setX(x);
        setY(y);
    }

    public float[] getXY(){
        float[] arrayXY = new float[2];
        arrayXY[0] = getX();
        arrayXY[1] = getY();
        System.out.println(Arrays.toString(arrayXY));
        return arrayXY;
    }

    public String toString() {
       return Arrays.toString(getXY());
    }
}
