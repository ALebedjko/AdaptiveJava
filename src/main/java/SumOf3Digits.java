import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOf3Digits {

    public static void main(String[] args) throws IOException {
        readSampleInputAndCountSummOfDigits();
    }


    public static void readSampleInputAndCountSummOfDigits() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer numberToSumDigits = Integer.parseInt(bufferedReader.readLine());
        Integer numberOfHundreds = numberToSumDigits / 100;
        Integer numberOfTens = (numberToSumDigits % 100) / 10;
        Integer numberOfOnes = numberToSumDigits % 10;

        System.out.println(numberOfHundreds + numberOfTens + numberOfOnes);
    }
}
