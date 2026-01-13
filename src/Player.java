import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private Scanner scan;
    private int numOfPlayers = 0;

    public Player(Scanner scan) {
        this.scan = scan;
        numOfPlayers++;
    }
}
