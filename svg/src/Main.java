import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x=50.0;
        p1.y=50.0;
        System.out.println(p1);

        System.out.println(p1.toSvg());

        p1.translate(10,-20);
        System.out.println(p1);
        System.out.println(p1.toSvg());

        Point p2=p1.translated(-30,40);
        System.out.println(p2);
        System.out.println(p2.toSvg());

        Segment s1= new Segment();
        s1.a=p1;
        s1.b=p2;

        System.out.println("Długość s1= "+ s1.leangth());
        System.out.println(s1);

        System.out.println(s1.toSvg());
        Segment[] segments = new Segment[3];
        segments[0]= new Segment();
        segments[0].a=new Point();
        segments[0].b=new Point();

        segments[0].a.x=0;
        segments[0].a.y=0;
        segments[0].b.x=0;
        segments[0].b.y=40;
        System.out.println(segments[0]);

        segments[1]=s1;
        segments[1]= new Segment();
        segments[1].a=new Point();
        segments[1].b=new Point();
        segments[1].a.x=0;
        segments[1].a.y=0;
        segments[1].b.x=33;
        segments[1].b.y=0;

        segments[2]= new Segment();
        segments[2].a=new Point();
        segments[2].b=new Point();
        segments[2].a.x=0;
        segments[2].a.y=0;
        segments[2].b.x=33;
        segments[2].b.y=0;
        Segment max =Segment.maxLength(segments);
        System.out.println("najdluzszy: "+ max);

    }
}
