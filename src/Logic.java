import java.util.*;

public class Logic {
    //Instance variables
    private int accountCount = 0;
    private String username = "";
    private Player currentPlayer;
    private List<Player> playerList = new ArrayList<>();

    private final Scanner scan;

    //Constructors
    public Logic(Scanner scan) {
        this.scan = scan;
    }

    //Methods
    public void runLogic() {
        boolean next = false;

        while (accountCount == 0 || !next) {
            System.out.println("Would you like to create a new account? (Enter 1) (Otherwise type anything else)");
            if ("1".equals(scan.nextLine())) {
                accountCount++;
                System.out.print("Enter your username: ");
                username = scan.nextLine();
                playerList.add(new Player(scan, accountCount, username));
            } else {
                next = true;
            }

            if (accountCount == 0) {
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
                System.out.println("This is not a number, or it might not be in the right format (it should be \"6\" or \"7\").");
            }
        }

        System.out.println("Logging in...\n");
        System.out.println("Hello " + currentPlayer.getUsername() + "!");
    }

    //helper methods


    //Getters and setters
    //hello im a getter!
}
