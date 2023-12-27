public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point destination) {
        double deltaX = this.x - destination.x;
        double deltaY = this.y - destination.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    @Override
    public String toString() {
        return "{" + x + ", " + y + "}";
    }
}
