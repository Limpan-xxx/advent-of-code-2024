
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day2 {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("puzzleInput");
        Scanner input = new Scanner(inputFile);

        int safeCounter = 0;
        while (input.hasNextLine()) {
            String data = input.nextLine();
            Scanner rowInput = new Scanner(data);
            Boolean safe = false;

            int previous = rowInput.nextInt();
            int previousDif = 0;
            while (rowInput.hasNextInt()) {
                int current = rowInput.nextInt();

                int currentDif = previous - current;

                if (Math.abs(currentDif) < 1 || Math.abs(currentDif) > 3) {
                    safe = false;
                    break;
                }

                if (previousDif == 0) {
                    safe = true;
                    previous = current;
                    previousDif = currentDif;
                    continue;
                }

                if (Integer.signum(previousDif) == Integer.signum(currentDif)) {
                    safe = true;
                    previous = current;
                    previousDif = currentDif;
                } else {
                    safe = false;
                    break;
                }
            }

            if (safe) {
                safeCounter++;
            }

        }
        System.out.println("Safe: " + safeCounter);
    }

}
