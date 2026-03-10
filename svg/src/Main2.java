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
    }
}
