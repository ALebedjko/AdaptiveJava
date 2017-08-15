import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class QuadraticEquationTest {

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
    public void testTwoRootsExpected() throws IOException {
        String firstTestSampleInput = "1\n" +
                "-1\n" +
                "-2";

        String expectedResult = "-1.0 2.0";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        QuadraticEquation.readSampleInputAndDetermineSquareRoots();

        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testEqualRootsExpected() throws IOException {
        String secondTestSampleInput = "6\n" +
                "12\n" +
                "6";

        String expectedResult = "-1.0";

        InputStream testCaseInputStream = new ByteArrayInputStream(secondTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        QuadraticEquation.readSampleInputAndDetermineSquareRoots();

        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testNoRealRootsExpected() throws IOException {
        String firstTestSampleInput = "6\n" +
                "-12\n" +
                "8";

        String expectedResult = "";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        QuadraticEquation.readSampleInputAndDetermineSquareRoots();

        assertEquals(expectedResult, outContent.toString());
    }
}
