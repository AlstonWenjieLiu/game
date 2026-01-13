import java.util.*;

public class Logic {
    private Scanner scan;
    int numOfPlayers = 0;
    String username = "";
    List<Player> playerList = new ArrayList<>();
    public Logic(Scanner scan) {
        this.scan = scan;
    }
    Player currentPlayer;

    public void logic() {
        boolean next = false;
        while (numOfPlayers == 0 || !next) {
            System.out.println("Would you like to create a new account? (Enter 1) (Otherwise type anything else)");
            if (scan.nextLine().equals("1")) {
                numOfPlayers++;
                System.out.print("Enter your username: ");
                username = scan.nextLine();
                playerList.add(new Player(scan, numOfPlayers, username));
            } else {
                next = true;
            }

            if (numOfPlayers == 0) {
                System.out.println("\nYou must have at least one account!");
                System.out.println("- - - - - - - - - - - - - - - -\n");
            }
        }

        System.out.println("Select an account (type the index of the arrayList): ");
        for (int i = 0; i < playerList.size(); i++) {
            System.out.print(playerList.get(i).getUsername());
            if (i != playerList.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.print("\nIndex: ");

        boolean validOption = false;
        while (!validOption) {
            String option = scan.nextLine();
            try {
                int opt = Integer.parseInt(option);
                currentPlayer = playerList.get(opt);
                validOption = true;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Please enter an index within bound.");
            } catch (NumberFormatException e) {
                System.out.println("This is not a number, or it might not be in the right format (it should be \"6\" or \"7\".");
            }
        }

        System.out.println("Logging in...\n");
        System.out.println("Hello " + currentPlayer.getUsername() + "!");
    }

    //helper methods
}
