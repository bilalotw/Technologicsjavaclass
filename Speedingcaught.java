public class Speedingcaught {
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday == true) {
            speed = speed - 5;
            if (speed <= 60) {
                return 0;

            } else if (speed >= 61 && speed <= 80) {
                return 1;
            } else {
                return 2;
            }

        } else {
            if (speed <= 60) {
                return 0;

            } else if (speed >= 61 && speed <= 80) {
                return 1;
            } else {
                return 2;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(caughtSpeeding(85, true));
    }
}
