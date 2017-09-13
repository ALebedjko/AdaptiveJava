import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DifferentRoomArea {

    private static final String triangleRoomType = "triangle";
    private static final String rectangleRoomType = "rectangle";
    private static final String circularRoomType = "circle";

    public static void main(String[] args) throws IOException {
        readSampleInputAndCalculateArea();
    }

    public static void readSampleInputAndCalculateArea() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String roomType = reader.readLine();

        switch (roomType) {
            case triangleRoomType: {
                Double firstSideOfTriangle = Double.parseDouble(reader.readLine());
                Double secondSideOfTriangle = Double.parseDouble(reader.readLine());
                Double thirdSideOfTriangle = Double.parseDouble(reader.readLine());

                double area = (firstSideOfTriangle + secondSideOfTriangle + thirdSideOfTriangle) / 2;
                System.out.println(area);
            }
            break;
            case rectangleRoomType: {
                Double firstSideOfRectangle = Double.parseDouble(reader.readLine());
                Double secondSideOfRectangle = Double.parseDouble(reader.readLine());

                double area = firstSideOfRectangle * secondSideOfRectangle;
                System.out.println(area);
            }
            break;
            case circularRoomType: {
                Double radius = Double.parseDouble(reader.readLine());

                double area = 3.14 * Math.pow(radius, 2);
                System.out.println(area);
            }
            break;
        }
    }
}
