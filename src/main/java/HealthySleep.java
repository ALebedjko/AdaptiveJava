import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HealthySleep {

    public static void main(String[] args) throws IOException {
        readInputAndPrintCorrespondingSleepQuality();
    }

    public static void readInputAndPrintCorrespondingSleepQuality() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer minRecommendedSleepHours = Integer.parseInt(bufferedReader.readLine());
        Integer maxRecommendedSleepHours = Integer.parseInt(bufferedReader.readLine());
        Integer actualSleepHours = Integer.parseInt(bufferedReader.readLine());

        if (actualSleepHours < minRecommendedSleepHours){
            System.out.print("Deficiency");
        } else if (actualSleepHours > maxRecommendedSleepHours) {
            System.out.print("Excess");
        } else {
            System.out.print("Normal");
        }
    }

}
