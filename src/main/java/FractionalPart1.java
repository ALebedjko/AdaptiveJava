import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FractionalPart1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double number = Double.parseDouble(bufferedReader.readLine());
        long integralPart = (long) number;
        double fractionalPart = number - integralPart;

        String fractionalPartString = String.format("%.9f", fractionalPart);
        System.out.println(fractionalPartString.substring(2, 3));

//        System.out.println(Double.POSITIVE_INFINITY % 5.5);
//        System.out.println(Double.POSITIVE_INFINITY / 5.0);
//
//        System.out.println("1 / Double.NaN = " + (1 / Double.NaN));
//        System.out.println("1 / Double.POSITIVE_INFINITY = " + (1 / Double.POSITIVE_INFINITY) );
//        System.out.println("Double.POSITIVE_INFINITY / 5.0 = " + (Double.POSITIVE_INFINITY / 5.0));
//        System.out.println("Double.POSITIVE_INFINITY + Double.POSITIVE_INFINITY = " + (Double.POSITIVE_INFINITY + Double.POSITIVE_INFINITY));
//        System.out.println("Double.NaN - Double.NaN = " + (Double.NaN - Double.NaN));
//        System.out.println("1.7 % Float.POSITIVE_INFINITY = " + (1.7 % Float.POSITIVE_INFINITY));
//        System.out.println("Double.POSITIVE_INFINITY % 5.5 = " + (Double.POSITIVE_INFINITY % 5.5));
    }

}
