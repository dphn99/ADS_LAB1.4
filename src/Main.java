import algorithms.CountingSort;
import models.Student;
import structures.OneWayLinkedList;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        OneWayLinkedList<Student> students = new OneWayLinkedList<>();
        students.add(new Student("Anna", "Koval", LocalDate.of(2003, 9, 14)));
        students.add(new Student("Bohdan", "Melnyk", LocalDate.of(2002, 2, 8)));
        students.add(new Student("Iryna", "Shevchenko", LocalDate.of(2004, 12, 21)));
        students.add(new Student("Danylo", "Bondar", LocalDate.of(2003, 2, 3)));
        students.add(new Student("Olena", "Tkachenko", LocalDate.of(2002, 6, 30)));

        System.out.println("Students before sorting:");
        students.print();

        CountingSort countingSort = new CountingSort(students);
        OneWayLinkedList<Student> sortedStudents = countingSort.sort();

        System.out.println("\nStudents sorted by birth month:");
        sortedStudents.print();
    }
}