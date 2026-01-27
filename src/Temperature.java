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

    public Temperature() {
        highTemp = 0;
        lowTemp = 0;
        tempScale = "";
    }

    public double convertCtoF(double temp) {
        return (temp * (9.0/5)) + 32;
    }

    public double convertFtoC(double temp) {
        return (temp - 32) * (5.0/9);
    }
}
