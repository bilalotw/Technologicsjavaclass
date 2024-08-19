public class lastdigit {
    public static boolean lastDigit(int a, int b, int c) {
        if (a % 10 == b % 10 || a % 10 == c % 10 || c % 10 == b % 10) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(lastDigit(17, 886, 777));
    }

}
