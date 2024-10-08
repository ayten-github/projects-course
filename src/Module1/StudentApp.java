package Module1;

import java.util.*;

public class StudentApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Ayten", 90.3, true, 19));
        students.add(new Student(2, "Selen", 80.2, true, 21));
        students.add(new Student(1, "Murad", 80.2, false, 22));
        students.add(new Student(2, "Alice", 90, false, 18));
        students.add(new Student(2, "Selen", 80.2, true, 23));
        students.add(new Student(3, "John", 80.2, false, 21));
        students.sort(
            Comparator.comparingDouble(Student::getScore).reversed()
                    .thenComparing(Comparator.comparing(Student::isGender).reversed())
                    .thenComparing(Comparator.comparingInt(Student::getAge).reversed())
                    .thenComparing((Student::getName))
                    .thenComparingInt(Student::getId)
        );

        students.forEach(System.out::println);
    }
}