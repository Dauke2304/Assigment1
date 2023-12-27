import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;

    public Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        int length = points.size();

        for (int i = 0; i < length - 1; i++) {
            perimeter += points.get(i).distanceTo(points.get(i + 1));
        }

        perimeter += points.get(length - 1).distanceTo(points.get(0));

        return perimeter;
    }

    public double getLongestSide() {
        double longestSide = 0;

        for (int i = 0; i < points.size() - 1; i++) {
            double temp = points.get(i).distanceTo(points.get(i + 1));
            if (temp > longestSide) {
                longestSide = temp;
            }
        }

        double temp = points.get(points.size() - 1).distanceTo(points.get(0));
        if (temp > longestSide) {
            longestSide = temp;
        }

        return longestSide;
    }

    public double getAverageSide() {
        double totalLength = calculatePerimeter();
        int numberOfSides = points.size();

        return totalLength / numberOfSides;
    }
}
