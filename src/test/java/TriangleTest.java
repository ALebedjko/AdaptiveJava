import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

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
    public void testTriangleExists() throws IOException {
        String firstTestSampleInput = "3\n" +
                "4\n" +
                "5";

        String expectedResult = "YES";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        Triangle.readInputAncCheckIfTriangleExists();

        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testTriangleNotExists() throws IOException {
        String firstTestSampleInput = "1\n" +
                "4\n" +
                "5";

        String expectedResult = "NO";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        Triangle.readInputAncCheckIfTriangleExists();

        assertEquals(expectedResult, outContent.toString());
    }
}


