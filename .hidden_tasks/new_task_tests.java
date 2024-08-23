// ArtworkTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class ArtworkTest {
    private Artwork artwork;

    @BeforeEach
    public void setUp() {
        artwork = new Artwork("Starry Night", "Vincent van Gogh", 1889, true);
    }

    @AfterEach
    public void tearDown() {
        artwork = null;
    }

    @Test
    public void testGetters() {
        assertEquals("Starry Night", artwork.getTitle());
        assertEquals("Vincent van Gogh", artwork.getArtist());
        assertEquals(1889, artwork.getYear());
        assertTrue(artwork.isOnDisplay());
    }

    @Test
    public void testSetters() {
        artwork.setTitle("Mona Lisa");
        artwork.setArtist("Leonardo da Vinci");
        artwork.setYear(1503);
        artwork.setOnDisplay(false);

        assertEquals("Mona Lisa", artwork.getTitle());
        assertEquals("Leonardo da Vinci", artwork.getArtist());
        assertEquals(1503, artwork.getYear());
        assertFalse(artwork.isOnDisplay());
    }

    @Test
    public void testYearBoundary() {
        artwork.setYear(0);
        assertEquals(0, artwork.getYear());
    }

    @Test
    public void testInvalidTitle() {
        artwork.setTitle(null);
        assertNull(artwork.getTitle());
    }

    @Test
    public void testInvalidArtist() {
        artwork.setArtist(null);
        assertNull(artwork.getArtist());
    }

    @Test
    public void testPerformance() {
        for (int i = 0; i < 10_000; i++) {
            artwork.setOnDisplay(!artwork.isOnDisplay());
        }
        // If it reaches this point without error, the test passes
    }
}

// ExhibitionTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class ExhibitionTest {
    private Exhibition exhibition;
    private Artwork artwork1;
    private Artwork artwork2;

    @BeforeEach
    public void setUp() {
        exhibition = new Exhibition();
        artwork1 = new Artwork("Starry Night", "Vincent van Gogh", 1889, true);
        artwork2 = new Artwork("The Scream", "Edvard Munch", 1893, false);
    }

    @AfterEach
    public void tearDown() {
        exhibition = null;
        artwork1 = null;
        artwork2 = null;
    }

    @Test
    public void testAddArtwork() {
        exhibition.addArtwork(artwork1);
        exhibition.addArtwork(artwork2);

        ArrayList<Artwork> artworks = new ArrayList<>();
        artworks.add(artwork1);
        artworks.add(artwork2);

        final Artwork[] artworkArray = new Artwork[artworks.size()];
        assertArrayEquals(artworks.toArray(artworkArray), exhibition.getArtworks().toArray(artworkArray));
    }

    // Additional tests could cover exhibition constraints and behaviors
}

// Note: Exhibition class needs a public getter for artworks list for above test
// public ArrayList<Artwork> getArtworks() {
//     return artworks;
// }

// GalleryTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class GalleryTest {
    private Gallery gallery;

    @BeforeEach
    public void setUp() {
        gallery = new Gallery();
    }

    @AfterEach
    public void tearDown() {
        gallery = null;
    }

    @Test
    public void testDisplayGalleryName() {
        gallery.displayGalleryName("Local Gallery");
        // This test doesn't assert, since method just prints to console.
        // Need to improve class design for better testability, e.g., making galleryName returnable.
    }
}