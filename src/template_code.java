import org.junit.Before;
    import org.junit.Test;
    import static org.junit.Assert.*;
    import java.util.Arrays;
    import java.util.List;

import java.util.ArrayList;


public class Artwork {
    // Fields
    private String title;
    private String artist;
    private int year;
    private boolean isOnDisplay;
    
    // Constructor
    public Artwork(String title, String artist, int year, boolean isOnDisplay) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.isOnDisplay = isOnDisplay;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isOnDisplay() {
        return isOnDisplay;
    }

    public void setOnDisplay(boolean isOnDisplay) {
        this.isOnDisplay = isOnDisplay;
    }

    // Method to print information
    public void printInfo() {
        System.out.println("Artwork Details:");
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Year: " + year);
        System.out.println("Is on display: " + isOnDisplay);
    }

    // Main method to test the Artwork class
    public static void main(String[] args) {
        Artwork artwork = new Artwork("Starry Night", "Vincent van Gogh", 1889, true);
        
        // Use getters to print the artwork information
        System.out.println("Title: " + artwork.getTitle());
        System.out.println("Artist: " + artwork.getArtist());
        System.out.println("Year: " + artwork.getYear());
        System.out.println("Is on display: " + artwork.isOnDisplay());

        // Modify artwork details using setters
        artwork.setTitle("Mona Lisa");
        artwork.setArtist("Leonardo da Vinci");
        artwork.setYear(1503);
        artwork.setOnDisplay(false);

        // Print updated information
        artwork.printInfo();
    }
}

public class Exhibition {
    private ArrayList<Artwork> artworks;

    // Constructor
    public Exhibition() {
        this.artworks = new ArrayList<>();
    }

    // Method to add an artwork
    public void addArtwork(Artwork art) {
        artworks.add(art);
    }

    // Method to list all artworks
    public void listArtworks() {
        for (Artwork art : artworks) {
            art.printInfo();
        }
    }

    // Main method to test Exhibition class
    public static void main(String[] args) {
        Exhibition exhibition = new Exhibition();
        
        Artwork artwork1 = new Artwork("Starry Night", "Vincent van Gogh", 1889, true);
        Artwork artwork2 = new Artwork("The Scream", "Edvard Munch", 1893, false);
        
        exhibition.addArtwork(artwork1);
        exhibition.addArtwork(artwork2);
        
        // List all artworks in the exhibition
        exhibition.listArtworks();
    }
}

public class Gallery {
    private String galleryName = "National Gallery";

    public void displayGalleryName(String galleryName) {
        // Use 'this' keyword to access the instance variable
        System.out.println(this.galleryName);
    }

    public static void main(String[] args) {
        Gallery gallery = new Gallery();
        gallery.displayGalleryName("Local Gallery");
    }
}