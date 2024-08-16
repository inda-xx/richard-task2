
public class Javamon {
    // Fields for the Javamon class
    private String name;
    private int health;
    private int power;
    private String type;

    public Javamon(String name, int health, int power, String type) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.type = type;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getPower() { return power; }
    public String getType() { return type; }

    public void setName(String name) { this.name = name; }
    public void setHealth(int health) { this.health = health; }
    public void setPower(int power) { this.power = power; }
    public void setType(String type) { this.type = type; }

    public void printStatus() {
        System.out.println("Javamon's Name: " + this.name);
        System.out.println("Javamon's Health: " + this.health);
        System.out.println("Javamon's Power: " + this.power);
        System.out.println("Javamon's Type: " + this.type);
    }

    public void battle(Javamon opponent) {
        if(opponent == null) {
            throw new IllegalArgumentException("Opponent Javamon cannot be null");
        }

        opponent.health -= this.power;
        if(opponent.health < 0)
            opponent.health = 0;

        printStatus();
        opponent.printStatus();
    }

    public static void main(String[] args) {
        Javamon javamon1 = new Javamon("Blastoise", 100, 10, "Water");
        Javamon javamon2 = new Javamon("Charizard", 100, 8, "Fire");

        javamon1.battle(javamon2);
    }
}
