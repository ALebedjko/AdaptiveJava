import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class LoginAndPassword {

    private static final String existingLogin = "100500";
    private static final String existingPassword = "424242";

    public static void main(String[] args) throws IOException {
        checkInputCredentialsAndProvideOutput();
    }

    public static void checkInputCredentialsAndProvideOutput() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String credentials = bufferedReader.readLine();

        String splitByWhiteSpaceRegExp = "\\s+";
        ArrayList<String> loginAndPassword = new ArrayList<>(Arrays.asList(credentials.split(splitByWhiteSpaceRegExp)));

        String login = loginAndPassword.get(0);
        String password = loginAndPassword.get(1);

        System.out.print(checkLoginAndPassword(login, password));
    }

    public static String checkLoginAndPassword(String login, String password) {
        if (isLoginValid(login) && isPasswordValid(password)) {
            return "Login success";
        } else if (isLoginValid(login) && !isPasswordValid(password)) {
            return "Wrong password";
        }
        return "No user with login " + login + " found";
    }

    public static Boolean isLoginValid(String login) {
        return existingLogin.equals(login);
    }

    public static Boolean isPasswordValid(String password) {
        return existingPassword.equals(password);
    }
}
