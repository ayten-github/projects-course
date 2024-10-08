package Module1;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private final int id;
    private final String name;
    private final double score;
    private final boolean gender;
    private final int age;

    public Student(int id, String name, double score, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.gender = gender;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public boolean isGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", score=" + score + ", gender=" + gender + ", age=" + age + '}';
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.id, student.id);
    }

}
