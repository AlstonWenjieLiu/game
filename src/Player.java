import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private Scanner scan;
    private int numOfPlayers = 0;
    private int playerNumber;
    private String username;
    private Enemy enemy;

    public Player(Scanner scan) {
        this.scan = scan;
    }

    public Player(Scanner scan, int playerNum, String name, int enemyLevel) {
        this.scan = scan;
        numOfPlayers++;
        playerNumber = playerNum;
        username = name;
        this.enemy = new Enemy(enemyLevel);
    }

    public Player(Scanner scan, int playerNum, String name) {
        this.scan = scan;
        numOfPlayers++;
        playerNumber = playerNum;
        username = name;
        this.enemy = new Enemy();
    }

    public Player(int playerNum, String name) {
        numOfPlayers++;
        playerNumber = playerNum;
        username = name;
    }

    public int getNumOfPlayers() {
        return numOfPlayers;
    }

    public String getUsername() {
        return username;
    }
}
