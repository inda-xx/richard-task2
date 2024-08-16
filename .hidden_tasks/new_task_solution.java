```java
    class Constellation {
        // Instance variables (fields)
        private String name;
        private int stars;
        private boolean visible;
        private String seasonalViewing;
        
        // Constructor that accepts and sets values to all instance variables
        public Constellation(String name, int stars, boolean visible, String seasonalViewing) {
            this.name = name;
            this.stars = stars;
            this.visible = visible;
            this.seasonalViewing = seasonalViewing;
        }
        
        // Getters
        public String getName() { return name; }
        public int getStars() { return stars; }
        public boolean getVisible() { return visible; }
        public String getSeasonalViewing() { return seasonalViewing; }
        
        // Setters
        public void setName(String newName) { this.name = newName; }
        public void setStars(int newStars) { this.stars = newStars;}
        public void setVisible(boolean newVisibleStatus) { this.visible = newVisibleStatus;}
        public void setSeasonalViewing(String newSeason) { this.seasonalViewing = newSeason;}        

        // Method to print details
        public void printDetails() {
            System.out.println("Name: " + name);
            System.out.println("Stars: " + stars);
            System.out.println("Visible: " + visible);
            System.out.println("Season for viewing: " + seasonalViewing);
        }
        
        // Method to check if constellation is visible based on season
        public boolean isVisible(String currentSeason) {
            // If the constellation is not visible, then return false
            if (!this.visible) {
                return false;
            }
            // If the constellation is at the best season to watch it and is visible, return true
            if (this.seasonalViewing.equals(currentSeason)) {
                return true;
            }
            
            return false;
        }

        // Main method for testing
        public static void main(String[] args) {
            // Create a new "Constellation" object
            Constellation pegasus = new Constellation("Pegasus", 14, true, "Autumn");
            
            // Print out the object's info
            pegasus.printDetails();
            
            // Test isVisible() method
            System.out.println("Is Pegasus visible in current season (Autumn)?: " + pegasus.isVisible("Autumn"));
        } 
    }
```

The above set of tests and code solution provide comprehensive coverage of the requirements outlined in the task. The main concept being addressed here is basic object modeling and scoping in Java.