import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class XORDigitsTest {

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
        String firstTestSampleInput = "11";

        String expectedResult = "0\n";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        XORDigits.readSampleInputAndXORDigits();

        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testSecondSampleInput() throws IOException {
        String firstTestSampleInput = "12";

        String expectedResult = "3\n";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        XORDigits.readSampleInputAndXORDigits();

        assertEquals(expectedResult, outContent.toString());
    }

}