import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquirrelsAndNuts1 {


    public static void main(String[] args) throws IOException {
        readInputAndDivideNutsEqually();
    }

    public static void readInputAndDivideNutsEqually() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer squirrelCount = Integer.parseInt(bufferedReader.readLine());
        Integer nutCount = Integer.parseInt(bufferedReader.readLine());

        System.out.print(nutCount / squirrelCount);
    }

}
