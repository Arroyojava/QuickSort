package Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static Algorithm.QuickSort.quickSort;
import static java.lang.System.out;

public class QuickSortTest {
    public static void main(String[] args) {

        // Integer test case
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add((int) (Math.random() * 100 + 1));
        }

        out.println("Integers before sorting:  " + numbers);
        long start = System.nanoTime();
        quickSort(numbers, 0, numbers.size() - 1);
        long end = System.nanoTime();
        out.println("Integers after sorting:   " + numbers);
        out.println("Runtime: " + (end - start) + " nanoseconds");
        out.println();

        // Float test case
        List<Float> floats = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            floats.add((float) (Math.random() * 100 + 1));
        }

        out.print("Floats before sorting: ");
        for (float num : floats) {
            out.printf("  %.2f", num);
        }
        start = System.nanoTime();
        quickSort(floats, 0, floats.size() - 1);
        end = System.nanoTime();
        out.print("\nFloats after sorting:  ");
        for (float num : floats) {
            out.printf("  %.2f", num);
        }
        out.println("\nRuntime: " + (end - start) + " nanoseconds");
        out.println();

        // String test case
        List<String> names = new ArrayList<>();
        names.add("Michael");
        names.add("Pam");
        names.add("Jim");
        names.add("Stanley");
        names.add("Creed");
        names.add("Dwight");
        names.add("Andy");
        names.add("Oscar");
        names.add("Kevin");
        names.add("Hank");

        out.println("Strings before sorting: " + names);
        start = System.nanoTime();
        quickSort(names, 0, names.size() - 1);
        end = System.nanoTime();
        out.println("Strings after sorting:  " + names);
        out.println("Runtime: " + (end - start) + " nanoseconds");
        out.println();

        // Character test case
        List<Character> character = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            char randChar = (char) (random.nextInt(26) + 'a');
            character.add(randChar);
        }

        // Output unsorted & sorted characters
        out.println("Characters before sorting: " + character);
        start = System.nanoTime();
        quickSort(character, 0, character.size() - 1);
        end = System.nanoTime();
        out.println("Characters after sorting:  " + character);
        out.println("Runtime: " + (end - start) + " nanoseconds");
    }
}
