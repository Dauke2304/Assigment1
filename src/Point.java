public class Point {
    private double x;
    private double y;

    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double distanceTo(Point nextpoint){
        double avx = this.x- nextpoint.x;
        double avy = this.y- nextpoint.y;
        return Math.sqrt((avx*avx)+(avy*avy)); //this method works just by special math formula
    }
    public String ToString(){
        return "{"+x+", "+y+"}";
    }
}
