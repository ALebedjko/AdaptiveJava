import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfTens {
    public static void main(String[] args) throws IOException {
        readInputAndCountNumberOfTens();
    }

    public static void readInputAndCountNumberOfTens() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer number = Integer.parseInt(bufferedReader.readLine());
        System.out.print((number % 100) / 10);
    }

}
