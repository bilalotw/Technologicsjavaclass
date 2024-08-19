public class more20 {
    public static boolean moretwenty(int n) {
        if (n > 20) {
            if (n % 20 == 1 | n % 20 == 2) {
                return true;
            } else
                return false;
        } else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(moretwenty(28));
    }
}
