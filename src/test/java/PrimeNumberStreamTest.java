import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class PrimeNumberStreamTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStream() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStream() {
        System.setIn(null);
        System.setOut(null);
    }

    @Test
    public void testFirstSampleInput() throws IOException {
        String firstSampleInput = "2";
        String expectedFirstSampleOutput = "True";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        PrimeNumberStream.readSampleInputAndDetermineIfNumberIsPrime();

        assertEquals(expectedFirstSampleOutput, outContent.toString());
    }

    @Test
    public void testSecondSampleInput() throws IOException {
        String firstSampleInput = "3";
        String expectedFirstSampleOutput = "True";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        PrimeNumberStream.readSampleInputAndDetermineIfNumberIsPrime();

        assertEquals(expectedFirstSampleOutput, outContent.toString());
    }

    @Test
    public void testThirdSampleInput() throws IOException {
        String firstSampleInput = "4";
        String expectedFirstSampleOutput = "False";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        PrimeNumberStream.readSampleInputAndDetermineIfNumberIsPrime();

        assertEquals(expectedFirstSampleOutput, outContent.toString());
    }
}
