import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Desks {

    public static void main(String[] args) throws IOException {
        readSampleInputAndCalculateDesks();
    }

    public static void readSampleInputAndCalculateDesks() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer numberOfStudentsInFirstClass = Integer.parseInt(bufferedReader.readLine());
        Integer numberOfStudentsInSecondClass = Integer.parseInt(bufferedReader.readLine());
        Integer numberOfStudentsInThirdClass = Integer.parseInt(bufferedReader.readLine());

        Integer smallestAmountOfNeededDesks = calculateAmountOfDesksPerClass(numberOfStudentsInFirstClass)
                + calculateAmountOfDesksPerClass(numberOfStudentsInSecondClass)
                + calculateAmountOfDesksPerClass(numberOfStudentsInThirdClass);

        System.out.println(smallestAmountOfNeededDesks);
    }

    private static int calculateAmountOfDesksPerClass(int numberOfStudentsInClass) {
        if (numberOfStudentsInClass % 2 == 0) {
            return numberOfStudentsInClass / 2;
        } else {
            return numberOfStudentsInClass / 2 + 1;
        }
    }

}
