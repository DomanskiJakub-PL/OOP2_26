import java.util.Arrays;
import java.util.Locale;

public class Polygon {
    private final Point[] points;
    Polygon(Point[] points){
        this.points=new Point[points.length];
        for(int i=0; i< points.length;i++){
            this.points[i]=new Point(points[i]);
        }
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
    public String toSVG(){
        StringBuilder pointsString= new StringBuilder();
        for(Point p: points){
            pointsString.append(String.format(Locale.ENGLISH, "%f,%f ", p.getX(), p.getY()));
        }
        return String.format("polygon points=\"%s\"", pointsString.toString());
    }
}
