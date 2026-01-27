import java.util.Scanner;

public class Temperature {
    private double highTemp;
    private double lowTemp;
    private String tempScale;

    private Scanner scan;

    public Temperature(Scanner scan) {
        highTemp = 0;
        lowTemp = 0;
        tempScale = "";
        this.scan = scan;
    }

    public Temperature(double highTemp, double lowTemp, String tempScale) {
        this.highTemp = highTemp;
        this.lowTemp = lowTemp;
        if (tempScale.equals("C")) {
            this.tempScale = "C";
        } else {
            this.tempScale = "F";
        }
    }

    public double convertCtoF(double temp) {
        double fahrenheit = temp * 9 / 5 + 32;
        return fahrenheit;
    }

    public double convertFtoC(double temp) {
        double celsius = (temp - 32) * 5 / 9;
        return celsius;
    }

    public void changeToC() {
        if (tempScale.equals("F")) {
            highTemp = convertFtoC(highTemp);
            lowTemp = convertFtoC(lowTemp);
            tempScale = "C";
        }
    }

    public void changeToF() {
        if (tempScale.equals("C")) {
            highTemp = convertCtoF(highTemp);
            lowTemp = convertCtoF(lowTemp);
            tempScale = "F";
        }
    }

    public String tempInfo() {
        if (tempScale.equals("F")) {
            return "High Temperature: " + highTemp + " F\nLow Temperature: " + lowTemp + " F";
        }
        return "High Temperature: " + highTemp + " C\nLow Temperature: " + lowTemp + " C";
    }
}
