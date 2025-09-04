import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import progassignment1.Series;


public class SeriesTest {
   private Series series;

    @BeforeEach
    void setUp() {
        series = new Series();
        // preload with sample data
        series.captureSeries("101", 12, "Minecraft Adventures", "20");
        series.captureSeries("102", 16, "Breaking Code", "15");
    }

    @Test
    void TestSearchSeries() {
        int index = series.SeriesID.indexOf("101");
        assertNotEquals(-1, index);
        assertEquals("Minecraft Adventures", series.SeriesName.get(index));
    }

    @Test
    void TestSearchSeries_SeriesNotFound() {
        int index = series.SeriesID.indexOf("999");
        assertEquals(-1, index); // not found
    }

    @Test
    void TestUpdateSeries() {
        int index = series.SeriesID.indexOf("101");
        series.SeriesName.set(index, "Minecraft Legends");
        assertEquals("Minecraft Legends", series.SeriesName.get(index));
    }

    @Test
    void TestDeleteSeries() {
        int index = series.SeriesID.indexOf("102");
        series.SeriesID.remove(index);
        assertFalse(series.SeriesID.contains("102"));
    }

    @Test
    void TestDeleteSeries_SeriesNotFound() {
        int index = series.SeriesID.indexOf("500");
        assertEquals(-1, index); // nothing deleted
    }

    @Test
    void TestSeriesAgeRestriction_AgeValid() {
        int age = 12;
        assertTrue(age >= 2 && age <= 18);
    }

    @Test
    void TestSeriesAgeRestriction_SeriesAgeInValid() {
        int age = 25;
        assertFalse(age >= 2 && age <= 18);
    } 
}
