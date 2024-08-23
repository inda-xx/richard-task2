
class Rocket {

    // Declare private instance fields/attributes
    private String name;
    private float speed;
    private int score;
    private boolean crashed;

    // Add your constructor here
    public Rocket(String name, float speed, int score, boolean crashed) {
        this.name = name;
        this.speed = speed;
        this.score = score;
        this.crashed = crashed;
    }

    public String getName() { return name; }
    public float getSpeed() { return speed; }
    public int getScore() { return score; }
    public boolean isCrashed() { return crashed; }

    public void setName(String name) { this.name = name; }
    public void setSpeed(float speed) { this.speed = speed; }
    public void setScore(int score) { this.score = score; }
    public void setCrashed(boolean crashed) { this.crashed = crashed; }

    public void collideWith(Asteroid asteroid) {
        if(this.speed >= asteroid.getSpeed()){
            this.score += 10;
        }else {
            this.crashed = true;
            this.score = 0;
        }
    }
    
    public void printStats() {
        System.out.println("Rocket Name: " + this.name);
        System.out.println("Rocket Speed: " + this.speed);
        System.out.println("Rocket Score: " + this.score);
        System.out.println("Rocket Crashed Status: " + this.crashed);
    }
}

class Asteroid {
    private String asteroidType;
    private float speed;

    public Asteroid(String asteroidType, float speed) {
        this.asteroidType = asteroidType;
        this.speed = speed;
    }

    public String getAsteroidType() { return asteroidType; }
    public float getSpeed() { return speed; }

    public void setAsteroidType(String asteroidType) { this.asteroidType = asteroidType; }
    public void setSpeed(float speed) { this.speed = speed; }
}

public class AceTheSpace {

    public static void main(String[] args) {
        Rocket rocket = new Rocket("Rocket X", 100f, 0, false);
        Asteroid asteroid = new Asteroid("Asteroid Y", 200f);

        rocket.collideWith(asteroid);
        rocket.printStats();
    }
}

class ScopeExample {
    // Insert examples of variable shadowing here
}
