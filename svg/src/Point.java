public class Point {
    private double x;
    private double y;
    //konstruktor
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    public Point(){
        this.x=0;
        this.y=0;
    }
    //konstuktor kopiujący
    public Point(Point other){
        this.x=other.x;
        this.y=other.y;
    }
    //akcesor (getter)
    public double getX(){
        return x;
    }
    //mutator
    public void SetX(double a){
        setX(a);
    } //akcesor (getter)
    public double getY(){
        return y;
    }
    //mutator
    public void SetY(double a){
        setX(a);
    }
    
    @Override
    public String toString(){
        return "("+ this.getX() +","+ this.getY() +")";
    }
    public String toSvg(){
        return"<circle r=\"2\" cx=\""+ this.getX() +"\"  " +
                "cy=\""+ this.getY() + "\" fill=\"red\" />";
    }

    public void translate(double dx, double dy){
        setX(getX() + dx);
        this.setY(this.getY() + dy);
    }
    public Point translated(double dx, double dy){
     Point newPoint=new Point();
     newPoint.setX(getX() +dx);
     newPoint.setY(getY() +dy);
     return newPoint;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
