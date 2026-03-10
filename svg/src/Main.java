public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(50,50);
        System.out.println(p1);

        System.out.println(p1.toSvg());

        p1.translate(10,-20);
        System.out.println(p1);
        System.out.println(p1.toSvg());

        Point p2=p1.translated(-30,40);
        System.out.println(p2);
        System.out.println(p2.toSvg());

        Segment s1= new Segment(p1,p2);
        System.out.println("Długość s1= "+ s1.leangth());
        System.out.println(s1);
        System.out.println(s1.toSvg());

        Segment[] segments = new Segment[3];
        segments[0]= new Segment(new Point(0,0),new Point(0,0));
        System.out.println(segments[0]);

        segments[1]=s1;

        segments[2]= new Segment(new Point(0,0),new Point(33,0));
        Segment max =Segment.maxLength(segments);
        System.out.println("najdluzszy: "+ max);
        System.out.println();
        p1.setX(100);
        p1.setY(100);
        System.out.println("s1 po modyfikacji: "+ s1);
        System.out.println("najdluzszy po modyfik: "+ max);

    }
}
