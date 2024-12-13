import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

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

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) > list2.get(i)) {
                totalDistance += list1.get(i) - list2.get(i);
            } else {
                totalDistance += list2.get(i) - list1.get(i);
            }
        }

        System.out.println(totalDistance);

    }
}