import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;


public class DifferentRoomAreaTest {

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
    public void testTriangleRoom() throws IOException {
        String inputContent = "triangle\n" +
                "3\n" +
                "4\n" +
                "5";
        String expectedResult = "6.0\n";

        InputStream testInputStream = new ByteArrayInputStream(inputContent.getBytes());
        System.setIn(testInputStream);

        DifferentRoomArea.readSampleInputAndCalculateArea();

        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testRectangleRoom() throws IOException {
        String inputContent = "rectangle\n" +
                "4\n" +
                "10";
        String expectedResult = "40.0\n";

        InputStream testInputStream = new ByteArrayInputStream(inputContent.getBytes());
        System.setIn(testInputStream);

        DifferentRoomArea.readSampleInputAndCalculateArea();

        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testCircleRoom() throws IOException {
        String inputContent = "circle\n" +
                "5";
        String expectedResult = "78.5\n";

        InputStream testInputStream = new ByteArrayInputStream(inputContent.getBytes());
        System.setIn(testInputStream);

        DifferentRoomArea.readSampleInputAndCalculateArea();

        assertEquals(expectedResult, outContent.toString());
    }

}
