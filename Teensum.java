public class Teensum {
    public static int teenSum(int a, int b) {
        if ((a <= 19 && a >= 13) || (b <= 19 && b >= 13)) {
            return 19;
        } else {
            return a + b;
        }
    }

    public static void main(String[] args) {
        System.out.println(teenSum(61, 19));
    }
}
