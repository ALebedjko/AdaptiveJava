import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XORDigits {

    public static void main(String[] args) throws IOException {
        readSampleInputAndXORDigits();
    }

    public static void readSampleInputAndXORDigits() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String twoDigitInputNumber = bufferedReader.readLine();
        int lengthOfNumber = twoDigitInputNumber.length();
        int firstNumber = Integer.parseInt(twoDigitInputNumber.substring(lengthOfNumber - 2, lengthOfNumber - 1));
        int secondNumber = Integer.parseInt(twoDigitInputNumber.substring(lengthOfNumber - 1, lengthOfNumber));
        System.out.println(firstNumber ^ secondNumber);
    }

}
