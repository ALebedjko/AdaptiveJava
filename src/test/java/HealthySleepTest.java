import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class HealthySleepTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setIn(null);
    }

    @Test
    public void testFirstSampleInput() throws IOException {
        String firstTestSampleInput =
                "6\n" +
                        "10\n" +
                        "8";
        String expectedResult = "Normal";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        HealthySleep.readInputAndPrintCorrespondingSleepQuality();

        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testSecondSampleInput() throws IOException {
        String firstTestSampleInput =
                "7\n" +
                        "9\n" +
                        "10";
        String expectedResult = "Excess";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        HealthySleep.readInputAndPrintCorrespondingSleepQuality();

        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testThirdSampleInput() throws IOException {
        String firstTestSampleInput =
                "7\n" +
                        "9\n" +
                        "2";
        String expectedResult = "Excess";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        HealthySleep.readInputAndPrintCorrespondingSleepQuality();

        assertEquals(expectedResult, outContent.toString());
    }

}
