import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {

    public static void main(String[] args) throws IOException {
        readInputAncCheckIfTriangleExists();
    }

    public static void readInputAncCheckIfTriangleExists() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer firstSide = Integer.parseInt(bufferedReader.readLine());
        Integer secondSide = Integer.parseInt(bufferedReader.readLine());
        Integer thirdSide = Integer.parseInt(bufferedReader.readLine());

        if (firstSide < secondSide + thirdSide && secondSide < firstSide + thirdSide && thirdSide < firstSide + secondSide) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }

}
