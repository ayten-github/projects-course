package Module1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Ayten", 90.3, true, 19));
        students.add(new Student(2, "Selen", 80.2, true, 21));
        students.add(new Student(1, "Murad", 80.2, false, 22));
        students.add(new Student(2, "Alice", 90, false, 18));
        students.add(new Student(2, "Selen", 80.2, true, 23));
        students.add(new Student(3, "John", 80.2, false, 21));
        students.sort((s1, s2) -> {
            int compare = Double.compare(s2.getScore(), s1.getScore());
            if (compare != 0) return compare; // Compare scores in descending order
            if (s1.isGender() != s2.isGender()) return s1.isGender() ? -1 : 1;
            if (s1.getAge() != s2.getAge()) return Integer.compare(s2.getAge(), s1.getAge());
            if (s1.getName().equalsIgnoreCase(s2.getName())) return -1 * s1.getName().compareTo(s2.getName());
            return s1.compareTo(s2);
        });

        students.forEach(System.out::println);
    }
}