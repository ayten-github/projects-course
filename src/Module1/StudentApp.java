package Module1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StudentApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Ayten", 90.3, true, 19));
        students.add(new Student(2, "Selen", 80.2, true, 21));
        students.add(new Student(1, "Murad", 80.2, false, 22));
        students.add(new Student(2, "Alice", 90, false, 18));
        students.add(new Student(2, "Selen", 80.2, true, 23));
        students.add(new Student(3, "John", 80.2, false, 21));
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}