public class Enemy {
    //instance variables
    private int level;
    private double health;
    private double strength;

    //Constructors
    public Enemy(int level) {
        this.level = level;
        health = level;
        strength = level;
    }

    public Enemy() {
        this.level = 1; //Default stats
        health = level;
        strength = level;
    }

    //Methods
    public void announce() {
        System.out.println("GRR!");
        System.out.println("I'm level " + getLevel() + ", you'll never defeat me!");
    }

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
