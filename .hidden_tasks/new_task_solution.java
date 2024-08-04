```java
class Alium {
    private String name;
    private int hp;
    private int attack;
    private int defense;
    private boolean defeated;
    private static int score = 0;

    public Alium(String name, int hp, int attack, int defense, boolean defeated) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.defeated = defeated;
    }

    public String getName() { return name; }

    public int getHp() { return hp; }

    public int getAttack() { return attack; }

    public int getDefense() { return defense; }

    public boolean isDefeated() { return defeated; }

    public void setName(String name) { this.name = name; }

    public void setHp(int hp) { this.hp = hp; }

    public void setAttack(int attack) { this.attack = attack; }

    public void setDefense(int defense) { this.defense = defense; }

    public void setDefeated(boolean defeated) { this.defeated = defeated; }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("HP: " + this.hp);
        System.out.println("Attack: " + this.attack);
        System.out.println("Defense: " + this.defense);
        System.out.println("Defeated: " + this.defeated);
    }

    public void move() {
        System.out.println(this.name + " moves in the battlefield.");
    }

    public void attack(Alium enemy) {
        int damage = this.attack - enemy.getDefense();
        if(damage > 0) {
            enemy.setHp(enemy.getHp() - damage);
            if(enemy.getHp() <= 0) {
                enemy.setDefeated(true);
                Alium.score += damage;
            }
        }
    }
}
```