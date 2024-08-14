public class AreaofCylenderNRA {
    public static void findarea(double r, double h) {// arguments
        double area = ((2 * 3.14 * r) * h) + (3.14 * r * r);
        System.out.println("The total surface area of a Cylender is: " + area);
        // NO return type
    }

    public static void main(String[] args) {
        double r = 7.8, h = 9.5;
        findarea(r, h);

    }
}
// NO RETURN TYPE WITH ARGUMENTS