import java.util.Arrays;
import java.util.Locale;

public class Polygon {
    private Point[] points;
    Polygon(Point[] points){
        this.points=points;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
    public String toSVG(){
        String pointsString="";
        for(Point p: points){
            pointsString+=String.format(Locale.ENGLISH,"%f,%f ",p.getX(), p.getY());
        }
        return String.format("polygon points=\"%s\"",pointsString);
    }
}
