```java
public class GalacticExplorer {
    private String name;              
    private int fuelLevel;
    private int exploredPlanets;
    private boolean isAlive;

    public GalacticExplorer(String name, int fuelLevel, int exploredPlanets){
        this.name = name;
        this.fuelLevel = fuelLevel;
        this.exploredPlanets = exploredPlanets;
        this.isAlive = true;
    }

    public String getName() { 
        return name;
    }

    public int getFuelLevel() { 
        return fuelLevel;
    }

    public int getExploredPlanets() { 
        return exploredPlanets;
    }

    public boolean getIsAlive() { 
        return isAlive;
    }

    public void setName(String name) { 
        this.name = name;
    }

    public void setFuelLevel(int fuelLevel) { 
        this.fuelLevel = fuelLevel;
    }

    public void setExploredPlanets(int exploredPlanets) {
        this.exploredPlanets = exploredPlanets;
    }

    public void setIsAlive(boolean isAlive) { 
        this.isAlive = isAlive;
    }

    public void fly() {
        if (this.getFuelLevel() <= 50){
            setIsAlive(false);
            System.out.println("Out of fuel! Explorer is no more.");
        } else {
            setFuelLevel(getFuelLevel()-50);
            System.out.println("Flying... Remaining Fuel Level: " + getFuelLevel());
        }
    }

    public void explore() {
        setExploredPlanets(getExploredPlanets()+1);
        System.out.println("Exploring... Total planets explored: " + getExploredPlanets());
    }

    public void printInfo() {
        System.out.println("GalacticExplorer Info:");
        System.out.println("\tName: " + getName());
        System.out.println("\tFuel level: " + getFuelLevel());
        System.out.println("\tNumber of explored planets: " + getExploredPlanets());
        System.out.println("\tIs alive: " + (getIsAlive() ? "YES" : "NO"));
    }

    public static void main(String[] args) {
        GalacticExplorer explorer = new GalacticExplorer("Neil", 200, 0);
        explorer.printInfo();
        explorer.fly();
        explorer.printInfo();
        explorer.explore();
        explorer.printInfo();
    }
}
```