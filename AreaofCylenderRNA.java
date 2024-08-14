public class AreaofCylenderRNA {
    public static double findarea() {// NO arguments
        double r = 7.8, h = 9.5;
        double area = ((2 * 3.14 * r) * h) + (3.14 * r * r);
        return area;// WITH return type
    }

    public static void main(String[] args) {

        double area = findarea();
        System.out.println("The total surface area of a Cylender is: " + area);

    }
}
// RETURN TYPE WITHOUT ARGUMENTS