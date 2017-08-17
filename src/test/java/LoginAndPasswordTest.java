import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class LoginAndPasswordTest {

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
    public void testLoginSuccess() throws IOException {
        String firstTestSampleInput = "100500 424242";

        String expectedResult = "Login success";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        LoginAndPassword.checkInputCredentialsAndProvideOutput();

        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testWrongPassword() throws IOException {
        String firstTestSampleInput = "100500 311231";

        String expectedResult = "Wrong password";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        LoginAndPassword.checkInputCredentialsAndProvideOutput();

        assertEquals(expectedResult, outContent.toString());
    }

    @Test
    public void testUserNotFound() throws IOException {
        String firstTestSampleInput = "21341 424242";

        String expectedResult = "No user with login 21341 found";

        InputStream testCaseInputStream = new ByteArrayInputStream(firstTestSampleInput.getBytes());
        System.setIn(testCaseInputStream);

        LoginAndPassword.checkInputCredentialsAndProvideOutput();

        assertEquals(expectedResult, outContent.toString());
    }
}



