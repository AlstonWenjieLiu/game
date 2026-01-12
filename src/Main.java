import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Logic game = new Logic(scan);
        game.start();
        scan.close();
    }
}