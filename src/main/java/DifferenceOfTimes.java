import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class DifferenceOfTimes {

    public static void main(String[] args) throws IOException {
        readSampleInputAndCalculateTimeRange();
    }

    public static void readSampleInputAndCalculateTimeRange() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer startHours = Integer.parseInt(bufferedReader.readLine());
        Integer startMinutes = Integer.parseInt(bufferedReader.readLine());
        Integer startSeconds = Integer.parseInt(bufferedReader.readLine());

        Integer endHours = Integer.parseInt(bufferedReader.readLine());
        Integer endMinutes = Integer.parseInt(bufferedReader.readLine());
        Integer endSeconds = Integer.parseInt(bufferedReader.readLine());

        Date startDate = new Date();
        startDate.setHours(startHours);
        startDate.setMinutes(startMinutes);
        startDate.setSeconds(startSeconds);

        Date endDate = new Date();
        endDate.setHours(endHours);
        endDate.setMinutes(endMinutes);
        endDate.setSeconds(endSeconds);

        long differenceInSeconds = (endDate.getTime() - startDate.getTime()) / 1000;
        System.out.println(differenceInSeconds);
    }

}
