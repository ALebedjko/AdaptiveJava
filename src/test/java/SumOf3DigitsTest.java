import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class SumOf3DigitsTest {

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
        String firstTestSampleInput = "476";

        String expectedResult = "17\n";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        SumOf3Digits.readSampleInputAndCountSummOfDigits();

        assertEquals(expectedResult, outContent.toString());
    }
}