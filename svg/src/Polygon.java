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
    public BoundingBox boundingBox(){
      Point p0 = new Point(points[0]);
      Point p1 = new Point(points[0]);
      for(Point p : points){
          if(p.getX() < p0.getX()) p0.setX(p.getX());
          if(p.getX() < p1.getX()) p1.setX(p.getX());
          if(p.getY() < p0.getY()) p0.setY(p.getY());
          if(p.getY() < p1.getY()) p1.setY(p.getY());
      }
      return new BoundingBox(
              p0.getX(),
              p0.getY(),
              p1.getX() - p0.getX(),
              p1.getY() - p0.getY()
      );
    };
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
