import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class GradesTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStream() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setIn(null);
        System.setOut(null);
    }

    @Test
    public void testGradesToGraders() throws IOException {
        String inputContent = "10\n" +
                "2\n" +
                "5\n" +
                "4\n" +
                "3\n" +
                "2\n" +
                "4\n" +
                "5\n" +
                "4\n" +
                "4\n" +
                "5";
        String expectedResult = "2 1 4 3\n";

        InputStream testInputStream = new ByteArrayInputStream(inputContent.getBytes());
        System.setIn(testInputStream);

        Grades.readSampleInputAndGetGrades();

        assertEquals(expectedResult, outContent.toString());

    }
}
