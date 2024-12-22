
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class day1 {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("puzzleInput");
        Scanner input = new Scanner(inputFile);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        while (input.hasNextInt()) {
            list1.add(input.nextInt());
            list2.add(input.nextInt());
        }

        Collections.sort(list1);
        Collections.sort(list2);

        int totalDistance = 0;

        // java day1 > sortedOutput
        for (int i = 0; i < list1.size(); i++) {

            totalDistance += Math.abs(list1.get(i) - list2.get(i));

        }

        System.out.println(totalDistance);

    }
}
