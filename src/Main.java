import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Logic game = new Logic(scan);
        Player p1 = new Player(scan);
        game.start();
        scan.close();
    }
}