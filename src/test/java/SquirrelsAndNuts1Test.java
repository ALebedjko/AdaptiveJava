import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class SquirrelsAndNuts1Test {

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
        String firstTestSampleInput = "3\n" +
                "14";

        String expectedResult = "4";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        SquirrelsAndNuts1.readInputAndDivideNutsEqually();

        assertEquals(expectedResult, outContent.toString());
    }
}
