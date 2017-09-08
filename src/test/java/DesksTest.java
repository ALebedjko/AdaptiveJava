import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class DesksTest {

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
        String firstTestSampleInput = "20\n" +
                "21\n" +
                "22";

        String expectedResult = "32\n";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        Desks.readSampleInputAndCalculateDesks();

        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testSecondSampleInput() throws IOException {
        String secondTestSampleInput = "16\n" +
                "18\n" +
                "20";

        String expectedResult = "27\n";

        InputStream testCaseInputStream = new ByteArrayInputStream(secondTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        Desks.readSampleInputAndCalculateDesks();

        assertEquals(expectedResult, outContent.toString());
    }

}
