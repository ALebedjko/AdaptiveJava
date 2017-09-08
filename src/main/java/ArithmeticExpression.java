import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticExpression {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer number = Integer.parseInt(bufferedReader.readLine());
        Integer expressionResult = (((number + 1) * number + 2) * number + 3);
        System.out.println(expressionResult);
    }

}
