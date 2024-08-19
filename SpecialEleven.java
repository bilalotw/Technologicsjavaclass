public class SpecialEleven {
    public static boolean specialEleven(int n) {
        if (n % 11 == 0 || n % 11 == 1) {
            return true;
        }

        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(specialEleven(28));
    }
}
