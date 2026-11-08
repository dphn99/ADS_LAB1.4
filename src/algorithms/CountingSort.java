
package algorithms;

import models.Student;
import structures.OneWayLinkedList;
import java.util.Arrays;

public class CountingSort {
    private static final int MONTHS = 12;

    private final OneWayLinkedList<Student> original;
    private final int[] count = new int[MONTHS + 1];
    private Student[] output;

    public CountingSort(OneWayLinkedList<Student> list) {
        original = list;
    }

    private void countOccurrences() {
        for (Student student : original) {
            int month = student.getBirthMonth();
            count[month]++;
        }
    }

    private void accumulateCounts() {
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
    }

    private void distribute() {
        output = new Student[original.size()];
        int[] positions = new int[count.length];

        for (int i = 1; i < count.length; i++) {
            positions[i] = count[i - 1];
        }

        for (Student student : original) {
            int month = student.getBirthMonth();

            output[positions[month]] = student;
            positions[month]++;
        }
    }

    public OneWayLinkedList<Student> sort() {
        Arrays.fill(count, 0);

        countOccurrences();
        accumulateCounts();
        distribute();

        OneWayLinkedList<Student> sorted = new OneWayLinkedList<>();

        for (Student student : output) {
            sorted.add(student);
        }

        return sorted;
    }
}
