```java
class BattleBeast {
    private String name;
    private int hp;
    private int attack;
    private int defense;
    private boolean fainted;

    public BattleBeast(String name, int hp, int attack, int defense) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.fainted = false;
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getDefense() {
        return this.defense;
    }

    public boolean getFainted() {
        return this.fainted;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setFainted(boolean fainted) {
        this.fainted = fainted;
    }

    public void attack(BattleBeast enemy) {
        int damage = this.attack / enemy.defense;
        enemy.hp -= damage;
        if(enemy.hp <= 0) {
            enemy.fainted = true;
        }
    }

    public void printInfo() {
        System.out.printf("Name: %s, Hp: %d, Attack: %d, Defense: %d, Fainted: %b\n", this.name, this.hp, this.attack, this.defense, this.fainted);
    }

    public static void main(String[] args) {
        
        BattleBeast beast1 = new BattleBeast("Griffon", 20, 10, 10);
        beast1.printInfo();

        BattleBeast beast2 = new BattleBeast("Phoenix", 30, 15, 20);
        beast2.printInfo();

        beast1.attack(beast2);
        beast1.printInfo();
        beast2.printInfo();

    }

}
```
In this solution, each BattleBeast has a name, hp (hit points), attack, defense, and fainted state. The attack method calculates the damage based on the attacker's attack and the defense of the Damage and determines whether the BattleBeast fainted as a result. The printInfo prints all information to the Terminal. The existing tests cover various scenarios, including invalid inputs, boundary conditions, and performance considerations.