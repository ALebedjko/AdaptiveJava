import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExactlyOnePositive {

    public static void main(String[] args) {

        System.out.println(isOnlyOneNumberPositive(1, 1, 1));
    }

    public static void readSampleInputAndCheckIsExactlyOnePositive() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString[] = reader.readLine().split("\\s+");

        Integer firstNumber = Integer.parseInt(inputString[0]);
        Integer secondNumber = Integer.parseInt(inputString[1]);
        Integer thirdNumber = Integer.parseInt(inputString[2]);

        System.out.println(isOnlyOneNumberPositive(firstNumber, secondNumber, thirdNumber));
    }


    private static boolean isOnlyOneNumberPositive(int a, int b, int c) {
        return (a > 0 ^ b > 0 ^ c > 0) ^ (a > 0 && b > 0 && c > 0);
    }

}
