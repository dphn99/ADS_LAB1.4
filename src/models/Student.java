package models;

import java.time.LocalDate;

public class Student {
    private String name;
    private String surname;
    private LocalDate birthDate;

    public Student(String name, String surname, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public int getBirthMonth() {
        return birthDate.getMonthValue();
    }

    @Override
    public String toString() {
        return name + " " + surname + ": " + birthDate;
    }

}
