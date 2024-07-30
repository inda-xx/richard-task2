```java
class FireDrake{
    private String name;
    private int hp;
    private int attack;
    private int defence;
    private boolean active;

    public FireDrake(String name, int hp, int attack, int defence) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
        this.active = true;
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
        return defence;
    }

    public void setDefense(int defence) {
        this.defence = defence;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void printFireDrakeInfo() {
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defence);
        System.out.println("Active: " + active);
    }

    public void battle(FireDrake opponent) {
        double damage = (double)this.attack / opponent.defence;
        if(opponent.hp > damage) {
            opponent.hp -= damage;
        } else {
            opponent.setActive(false);
            opponent.setHp(0);
        }
    }
}
```