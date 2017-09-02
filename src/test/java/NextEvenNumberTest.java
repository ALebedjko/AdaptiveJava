import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class NextEvenNumberTest {

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
        String firstTestSampleInput = "7";

        String expectedResult = "8\n";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        NextEvenNumber.readSampleInputAndDetermineNextEvenNumber();

        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testSecondSampleInput() throws IOException {
        String firstTestSampleInput = "8";

        String expectedResult = "10\n";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        NextEvenNumber.readSampleInputAndDetermineNextEvenNumber();

        assertEquals(expectedResult, outContent.toString());
    }
}
