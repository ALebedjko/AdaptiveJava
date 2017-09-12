import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class ExactlyOnePositiveTest {

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
    public void testAllPositive() throws IOException {
        String firstTestSampleInput = "1 1 1";

        String expectedResult = "false\n";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        ExactlyOnePositive.readSampleInputAndCheckIsExactlyOnePositive();

        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testTwoPositives() throws IOException {
        String firstTestSampleInput = "1 0 1";

        String expectedResult = "false\n";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        ExactlyOnePositive.readSampleInputAndCheckIsExactlyOnePositive();

        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testOnePositive() throws IOException {
        String firstTestSampleInput = "0 1 0";

        String expectedResult = "true\n";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        ExactlyOnePositive.readSampleInputAndCheckIsExactlyOnePositive();

        assertEquals(expectedResult, outContent.toString());
    }

}
