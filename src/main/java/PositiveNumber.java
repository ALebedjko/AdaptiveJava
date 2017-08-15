import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositiveNumber {

    public static void main(String[] args) throws IOException {
        readInputAndDetermineIfNegative();
    }

    public static void readInputAndDetermineIfNegative() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer inputNumber = Integer.parseInt(bufferedReader.readLine());

        if (inputNumber > 0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
