import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Grades {

    public static int AGraderCount = 0;
    public static int BGraderCount = 0;
    public static int CGraderCount = 0;
    public static int DGraderCount = 0;

    public static void main(String[] args) throws IOException {
        readSampleInputAndGetGrades();
    }

    public static void readSampleInputAndGetGrades() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int studentCount = Integer.parseInt(reader.readLine());

        for (int i = 0; i < studentCount; i++) {
            checkGradeAndAddToAppropriateGrades(Integer.parseInt(reader.readLine()));
        }

        System.out.println(DGraderCount + " " + CGraderCount + " " + BGraderCount + " " + AGraderCount);
    }

    public static void checkGradeAndAddToAppropriateGrades(int grade) {
        if (grade == 5) AGraderCount++;
        if (grade == 4) BGraderCount++;
        if (grade == 3) CGraderCount++;
        if (grade == 2) DGraderCount++;
    }
}
