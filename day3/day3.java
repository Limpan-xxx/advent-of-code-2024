
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class day3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String input = new String(Files.readAllBytes(Paths.get("puzzleInput")));
        String regex = "mul\\((\\d+),(\\d+)\\)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int matcSum = 0;

        while (matcher.find()) {
            int a = Integer.parseInt(matcher.group(1));
            int b = Integer.parseInt(matcher.group(2));

            matcSum += a * b;
        }

        System.out.println(matcSum);

    }
}
