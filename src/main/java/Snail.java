import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snail {
    public static void main(String[] args) throws IOException {
        readInputAndCountDays();
    }

    public static void readInputAndCountDays() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer poleHeight = Integer.parseInt(bufferedReader.readLine());
        Integer amountOfFeetUpPerDay = Integer.parseInt(bufferedReader.readLine());
        Integer amountOfFeetDownPerNight = Integer.parseInt(bufferedReader.readLine());

        Integer dayCount = 0;

        Integer currentPosition = 0;

        while (currentPosition < poleHeight && currentPosition != poleHeight) {
            currentPosition += amountOfFeetUpPerDay;
            dayCount++;

            if (currentPosition >= poleHeight) {
                System.out.print(dayCount);
                break;
            }

            if (currentPosition >= amountOfFeetDownPerNight) {
                currentPosition -= amountOfFeetDownPerNight;
            }

        }

    }

}
