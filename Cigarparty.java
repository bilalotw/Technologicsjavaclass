public class Cigarparty {

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend == false) {
            if (cigars <= 60 && cigars >= 40) {
                return true;
            } else {
                return false;
            }
        } else {
            if (cigars >= 40) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(cigarParty(120, true));
    }

}
