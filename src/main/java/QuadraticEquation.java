import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class QuadraticEquation {

    public static void main(String[] args) throws IOException {
        readSampleInputAndDetermineSquareRoots();
    }

    public static void readSampleInputAndDetermineSquareRoots() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Double firstCoefficient = Double.parseDouble(bufferedReader.readLine());
        Double secondCoefficient = Double.parseDouble(bufferedReader.readLine());
        Double thirdCoefficient = Double.parseDouble(bufferedReader.readLine());

        Double determinant = Math.pow(secondCoefficient, 2) - 4 * firstCoefficient * thirdCoefficient;
        ArrayList<Double> resultingSquareRootsArray = new ArrayList<>();

        if (determinant >= 0) {
            Double firstSquareRoot = (-secondCoefficient + Math.sqrt(determinant)) / (2 * firstCoefficient);
            resultingSquareRootsArray.add(firstSquareRoot);
        }

        if (determinant > 0) {
            Double secondSquareRoot = (-secondCoefficient - Math.sqrt(determinant)) / (2 * firstCoefficient);
            resultingSquareRootsArray.add(secondSquareRoot);
        }

        Collections.sort(resultingSquareRootsArray);

        String resultString = "";
        for (Double root : resultingSquareRootsArray
                ) {
            resultString += root + " ";
        }
        resultString = resultString.trim();

        if (resultString.length() > 0) {
            System.out.print(resultString);
        }
    }
}
