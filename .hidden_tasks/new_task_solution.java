```java
public class Bot {
    private String name;
    private int hp;
    private int attack;
    private int defense;

    public Bot(String name, int hp, int attack, int defense) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void printInfo() {
        System.out.println("Bot Name: " + name);
        System.out.println("Hit Points: " + hp);
        System.out.println("Attack Power: " + attack);
        System.out.println("Defense: " + defense);
    }

    public void attack(Bot bot) {
        int damage = this.attack - bot.getDefense();
        if (damage > 0) {
            bot.setHp(bot.getHp() - damage);
        }
    }

    public static void main(String[] args) {
        Bot bot1 = new Bot("Alpha", 100, 20, 10);
        Bot bot2 = new Bot("Beta", 120, 25, 5);

        System.out.println("===== Before Attack =====");
        bot1.printInfo();
        bot2.printInfo();

        bot1.attack(bot2);

        System.out.println("===== After Attack =====");
        bot1.printInfo();
        bot2.printInfo();
    }
}
```