/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    public Restaurant test = new Restaurant("today restaurant", 3, "JD");

    @Test
    public void testRestaurantToString() {
        String output = test.toString();
        String expected = "Restaurant{name='today restaurant', numOfStars=3, priceCategory='JD', reviews=[]}";
        assertEquals(expected, output);
    }

    @Test
    public void testReviewToString() {
        Review rev = new Review( "review 1", "Bayan", 3);
        String output = rev.toString();
        String expected = "Review{body='review 1', author='Bayan', numOfStars=3}";
        assertEquals(expected, output);
    }
    @Test
    public void testAddReview() {
        Review review = new Review("review 1", "Bayan", 3);
        test.addReview(review);
        String output = test.toString();
        String expected = "Restaurant{name='today restaurant', numOfStars=3, priceCategory='JD', reviews=[Review{body='review 1', author='Bayan', numOfStars=3}]}";
        assertEquals(expected, output);
    }
}
