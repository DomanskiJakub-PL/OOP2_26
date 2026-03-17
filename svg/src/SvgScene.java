import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class SvgScene {
    private Polygon[] polygons;
    private int i;

    public SvgScene(){
        polygons=new Polygon[3];
        i=0;
    }
    public void addPolygon(Polygon poly){
        polygons[i] = poly;
        i= ( i + 1 ) % 3;
    }

    private BoundingBox boundingBox(){
        double minWidth=0;
        double minHeight=0;
        for(Polygon poly: polygons){
            if(poly == null) continue;
             BoundingBox bb =poly.boundingBox();
             double width = bb.x() + bb.width();
             if(width>minWidth) minWidth = width;
             double height = bb.y() + bb.height();
             if(height>minHeight) minHeight = height;
        }
        return new BoundingBox(0,0,minWidth,minHeight);
    }
    public void save(String filename){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            BoundingBox bb = boundingBox();
            String svg = String.format(Locale.ENGLISH, "<svg height=\"%f\" width=\"%f\" xmlns=\"http://www.w3.org/2000/svg\">\n" +
                    "  <polygon points=\"100,10 150,190 50,190\" style=\"fill:lime;stroke:purple;stroke-width:3\" />\n", bb.height(),bb.width());
            writer.write(svg);

            writer.write(this.toSvg());

            svg="</svg>";
            writer.write(svg);

            writer.close();
        } catch (IOException e){
            System.err.printf("Nie udało się otworzyć pliku: %s%n", e.getMessage());
        }
    }
    public String toSvg(){
        String svg="";
        for(Polygon p : polygons){
            if(p==null) continue;
            svg+=p.toSVG() + "\n";
        }
        return svg;
    }
}
