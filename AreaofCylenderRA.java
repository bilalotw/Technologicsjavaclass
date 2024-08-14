public class AreaofCylenderRA {
    public static double findarea(double r, double h) {// arguments
        double area = ((2 * 3.14 * r) * h) + (3.14 * r * r);
        return area;// return type
    }

    public static void main(String[] args) {
        double r = 7.8, h = 9.5;
        double area = findarea(r, h);
        System.out.println("The total surface area of a Cylender is: " + area);

    }
}
// RETURN TYPE WITH ARGUMENTS