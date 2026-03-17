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
    public String toSvg(){
        String svg="";
        for(Polygon p : polygons){
            if(p==null) continue;
            svg+=p.toSVG() + "\n";
        }
        return svg;
    }
}
