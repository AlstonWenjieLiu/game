import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //This scanner is passed to other classes.
        Player playerScanner = new Player(scan, 0, "stub");
        Enemy enemyScanner = new Enemy(scan);
        Logic LogicScanner = new Logic(scan);

        LogicScanner.runLogic();
        scan.close();
    }
}