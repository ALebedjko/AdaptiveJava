import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class PositiveNumberTest {
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
    public void testPositiveExpected() throws IOException {
        String firstTestSampleInput = "7";

        String expectedResult = "YES";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        PositiveNumber.readInputAndDetermineIfNegative();

        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testNegativeExpected() throws IOException {
        String firstTestSampleInput = "-1";

        String expectedResult = "NO";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        PositiveNumber.readInputAndDetermineIfNegative();

        assertEquals(expectedResult, outContent.toString());
    }


}
