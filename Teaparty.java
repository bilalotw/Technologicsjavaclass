public class Teaparty {
    public static int teaParty(int tea, int candy) {

        if (tea >= 5 & candy >= 5) {
            if (tea >= 2 * candy || candy >= 2 * tea) {
                return 2;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(teaParty(5, 9));
    }
}
