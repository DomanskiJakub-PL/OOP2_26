public class Main2 {
    public static void main(String[] args) {
        // wielokąty
        Point[] verticies = new Point[4];
        Point v1 = new Point(10,10);
        verticies[0]=v1;
        verticies[1]=new Point(50,50);
        Point v2=new Point(70,10);
        verticies[2]=v2;
        verticies[3]=new Point(10,70);
        Polygon poly =new Polygon(verticies);
        System.out.println(poly);
        System.out.println(poly.toSVG());
        verticies[1]= new Point(100,100);
        v1.setX(100);
        System.out.println("Po zmianie: " + poly);
        System.out.println();
         //SVG Scene

        SvgScene scene = new SvgScene();
        scene.addPolygon(poly);
        scene.addPolygon(new Polygon(new Point[]{
                new Point(120,120),
                new Point(160,160),
                new Point(120,160)
        }));
        scene.addPolygon(new Polygon(new Point[]{
                new Point(10,100),
                new Point(20,200),
                new Point(80,160)
        }));
        System.out.println(scene.toSvg());
        scene.save("obrazek.svg");
    }
}
