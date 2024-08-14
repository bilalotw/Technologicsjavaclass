public class Pricedrop {

    public static void find(double price, double pastprice) {
        if (price < pastprice) {
            double change = pastprice - price;
            char option = 'a';
            double p = calculate(change, pastprice);
            alert(p, option);
        } else if (price > pastprice) {
            double change = price - pastprice;
            char option = 'b';
            double p = calculate(change, pastprice);
            alert(p, option);
        } else {
            char option = 'c';
            alert(0, option);
        }

    }

    public static void alert(double x, char stat) {
        if (stat == 'a') {

            System.out.println("Price is getting reduced to " + x + "percentage");

        } else if (stat == 'b') {

            System.out.println("Price is getting increased with " + x + "percentage");
        } else if (stat == 'c') {
            System.out.println("There is no change in the price");
        } else {
            System.out.println("something went wrong");
        }
    }

    public static double calculate(double x, double pastprice) {
        double p = 0;

        p = x * pastprice / 100;

        return p;

    }

    public static void main(String[] args) {
        double pastprice = 63.78;
        double price = 99.53;
        find(price, pastprice);

    }

}
