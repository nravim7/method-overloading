public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(5,2));
        System.out.println(area(-5, 20));
        System.out.println(area(-5));
        System.out.println(area(-6,-3));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return (3.14 * radius * radius);
    }

    public static double area(double x, double y) {
        if(x<0 || y<0) {
            return -1.0;
        }
        return (x*y);
    }
}
