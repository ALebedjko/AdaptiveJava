import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumTo20 {

    public static void main(String[] args) throws IOException {
        getInputAndDetermineIfAnyPairSumEquals20();
    }

    public static void getInputAndDetermineIfAnyPairSumEquals20() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String splitInput[] = reader.readLine().split("\\s+");

        Integer firstNumber = Integer.parseInt(splitInput[0]);
        Integer secondNumber = Integer.parseInt(splitInput[1]);
        Integer thirdNumber = Integer.parseInt(splitInput[2]);

        System.out.println(pairSum20(firstNumber, secondNumber, thirdNumber));
    }

    public static boolean pairSum20(int a, int b, int c) {
        return a + b == 20 || b + c == 10 || a + c == 20;
    }
}
