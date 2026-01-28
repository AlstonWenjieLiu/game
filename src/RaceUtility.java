public class RaceUtility {
    // write this "utility" class to meet the specs above
    private RaceUtility() {

    }

    public static double milesToKm(double miles) {
        double kilometers = miles * 1.609;
        return kilometers;
    }

    public static double kmToMiles(double kilometers) {
        double miles = kilometers / 1.609;
        return miles;
    }

    public static String makeProper(String str) {
        String newStr = "";
        String currentStr = "";
        String lowerCaseStr = str.toLowerCase();
        int length = str.length();
        boolean newWord = true;

        for (int i = 0; i < length; i++) {
            currentStr = lowerCaseStr.substring(i, i + 1);
            if (newWord == true) {
                currentStr = currentStr.toUpperCase();
                newWord = false;
            }
            if (currentStr.equals(" ")) {
                newWord = true;
            }
            newStr += currentStr;
        }

        return newStr;
    }
}
