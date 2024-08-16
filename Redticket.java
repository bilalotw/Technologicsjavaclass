public class Redticket {
    public static int redTicket(int a, int b, int c) {
        if (a == b && b == c) {
            if (a == 2) {
                return 10;
            } else {
                return 5;
            }
        } else if (a != c & b != a) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(redTicket(0, 1, 1));
    }
}
