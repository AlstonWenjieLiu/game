import java.util.Scanner;

/**
 * This class is the runner class so it does not have any constructors
 *
 * @author ALSTONLIU
 */
public class Main {
    public static void main(String[] args) {
        /** This scanner is passed to other classes */
        Scanner scan = new Scanner(System.in);
        Player playerScanner = new Player(scan, 0, "stub");
        Enemy enemyScanner = new Enemy(scan);
        Logic LogicScanner = new Logic(scan);

        LogicScanner.runLogic();
        scan.close();
    }
}