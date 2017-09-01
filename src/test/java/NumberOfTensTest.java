import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class NumberOfTensTest {

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
    public void testSampleInput() throws IOException {
        String firstTestSampleInput = "173";

        String expectedResult = "7";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        NumberOfTens.readInputAndCountNumberOfTens();

        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testSecondSampleInput() throws IOException {
        String firstTestSampleInput = "78";

        String expectedResult = "7";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        NumberOfTens.readInputAndCountNumberOfTens();

        assertEquals(expectedResult, outContent.toString());
    }
}
