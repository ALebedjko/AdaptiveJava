import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class DifferenceOfTimesTest {


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
                "1\n" +
                        "1\n" +
                        "1\n" +
                        "2\n" +
                        "2\n" +
                        "2";

        String expectedResult = "3661\n";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        DifferenceOfTimes.readSampleInputAndCalculateTimeRange();

        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testSecondSampleInput() throws IOException {
        String firstTestSampleInput =
                "1\n" +
                        "2\n" +
                        "30\n" +
                        "1\n" +
                        "3\n" +
                        "20";

        String expectedResult = "50\n";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        DifferenceOfTimes.readSampleInputAndCalculateTimeRange();

        assertEquals(expectedResult, outContent.toString());
    }
}
