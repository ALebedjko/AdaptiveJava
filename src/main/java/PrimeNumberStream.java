import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static org.apache.commons.lang3.StringUtils.capitalize;

public class PrimeNumberStream {

    public static void main(String[] args) throws IOException {
        readSampleInputAndDetermineIfNumberIsPrime();
    }

    private static String isPrime(int number) {
        IntPredicate isDivisibleByIndex = index -> number % index == 0;
        boolean isPrime = number > 1 && IntStream.range(2, number - 1).noneMatch(isDivisibleByIndex);
        String result = capitalize(Boolean.toString(isPrime));
        return result;
    }

    public static boolean isPrime(final long number) {
        LongPredicate isDivisibleByIndex = index -> number % index == 0;
        return number > 1 && LongStream.range(2, number - 1).noneMatch(isDivisibleByIndex);
    }

    public static void readSampleInputAndDetermineIfNumberIsPrime() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer number = Integer.parseInt(bufferedReader.readLine());
        System.out.print(isPrime(number));
    }
}
