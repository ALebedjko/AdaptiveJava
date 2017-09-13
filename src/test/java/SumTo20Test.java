import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class SumTo20Test {


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
    public void testSumNotEquals20() throws IOException {
        String firstTestSampleInput = "1 2 3";

        String expectedResult = "false\n";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        SumTo20.getInputAndDetermineIfAnyPairSumEquals20();

        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testSumEquals20() throws IOException {
        String firstTestSampleInput = "4 16 7";

        String expectedResult = "true\n";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        SumTo20.getInputAndDetermineIfAnyPairSumEquals20();

        assertEquals(expectedResult, outContent.toString());
    }
}
