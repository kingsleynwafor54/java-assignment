package Kata;

public class Kata {
    public int calculatePrice(int testDrillerQuality) {
        if (testDrillerQuality >= 1 && testDrillerQuality <= 4) {
            return 1500 * testDrillerQuality;
        } else if (testDrillerQuality >= 4 && testDrillerQuality <= 9) {
            return 1400 * testDrillerQuality;
        } else if (testDrillerQuality > 9 && testDrillerQuality <= 29) {
            return 1100 * testDrillerQuality;

        } else if (testDrillerQuality > 29 && testDrillerQuality <= 49) {
            return 1100 * testDrillerQuality;
        } else if (testDrillerQuality > 49 && testDrillerQuality <= 99) {
            return 1000 * testDrillerQuality;
        } else if (testDrillerQuality > 99 && testDrillerQuality <= 199) {
            return 900 * testDrillerQuality;
        } else if (testDrillerQuality == 200) {
            return 800 * testDrillerQuality;
        } else return 0;
    }
}