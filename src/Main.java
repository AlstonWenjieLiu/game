import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //This scanner is passed to other classes.
        Player scanner = new Player(scan, 0, "stub");
        Logic game = new Logic(scan);
        game.logic();
        scan.close();
    }
}