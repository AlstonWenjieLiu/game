import java.util.Scanner;

/**
 * This class represents enemies
 * 
 * @author ALSTONLIU 
 */
public class Enemy {
    //Dependencies
    /** The scanner */
    private Scanner scan;

    //instance variables
    /** The level of the enemy */
    private int level;

    /** The health of the enemy */
    private double health;

    /** The strength of the enemy */
    private double strength;

    //Constructors
    /**
     * Instantiates the Enemy object.
     *
     * @param scan The passed scanner
     */
    public Enemy(Scanner scan) {
        this.scan = scan;
    }

    /**
     * Instantiates the Enemy object.
     *
     * @param level The enemy's level
     */
    public Enemy(int level) {
        this.level = level;
        health = level;
        strength = level;
    }

    /**
     * Instantiates the Enemy object.
     */
    public Enemy() {
        this.level = 1; //Default stats
        health = level;
        strength = level;
    }

    //Methods
    /**
     * Prints out the enemy's announcements
     */
    public void announce() {
        System.out.println("GRR!");
        System.out.println("I'm level " + getLevel() + ", you'll never defeat me!");
    }

    /**
     * Prints out the enemy's information
     */
    public void getStats() {
        System.out.println(" - - - Enemy Stats - - - ");
        System.out.println("Level:" + getLevel());
        System.out.println("Health:" + getHealth());
        System.out.println("Strength: " + getStrength());
    }

    //Getters and setters
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }
}
