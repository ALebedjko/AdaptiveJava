import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextEvenNumber {

    public static void main(String[] args) throws IOException {
        readSampleInputAndDetermineNextEvenNumber();
    }


    public static void readSampleInputAndDetermineNextEvenNumber() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer inputNumber = Integer.parseInt(bufferedReader.readLine());

        if (isEvenNumber(inputNumber)) {
            System.out.println(inputNumber + 2);
        } else {
            System.out.println(inputNumber + 1);
        }

    }

    private static boolean isEvenNumber(int numberToCheck) {
        return numberToCheck % 2 == 0;
    }

}
