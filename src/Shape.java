public class Shape {
    public Point[] points;

    public Shape (Point[] points){
        this.points=points;
    }
    public double Perimeter(){
        double result = 0;
        int length = points.length;
        result+= points[length - 1].distanceTo(points[0]);
        for(int i = 0;i<length-1;i++){
            result+=points[i].distanceTo(points[i+1]);
        }
        return result;
    }
    public double LongestSide(){
        double result =0;
        int length = points.length;
        for(int i = 0;i<length-1;i++){
            double temp=points[i].distanceTo(points[i+1]);
            if(temp>result){
                result = temp;
            }
        }
        double temp = points[length - 1].distanceTo(points[0]);
        if(temp>result){
            result = temp;
        }
        return result;
    }

    public double AverageSide(){
        int length = points.length;
        double all = Perimeter();
        return all/length;
    }
}
