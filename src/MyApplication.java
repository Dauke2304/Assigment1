import java.util.Scanner;
public class MyApplication {
    public static void main(String[] args){
        Scanner jin = new Scanner(System.in); //Scanner named by "jin"
        int size =10;//number of points
        Point[] All = new Point[size];

        for (int i =0;i<size;i++){
            double x = jin.nextDouble();
            double y = jin.nextDouble();
            Point temp = new Point(x,y);
            All[i]=temp;
        }// Input of every point

        Shape shape = new Shape(All);//Creating shape class object, and giving to it the points that we get above

        for(int i =0;i<size;i++){
            String temp = shape.points[i].ToString();//Output of everypoint
            System.out.println(temp);
        }
        System.out.println("Perimeter:" + shape.Perimeter());
        System.out.println("Longest Side:" + shape.LongestSide());
        System.out.println("Average Side:" + shape.AverageSide());

    }
}