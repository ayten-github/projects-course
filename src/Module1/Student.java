package Module1;

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
        int compare = Double.compare(student.score, this.score);
        if (compare != 0) return compare;
        if (this.gender != student.gender) {
            return this.gender ? -1 : 1;
        }
        if (this.age != student.age) return Integer.compare(student.age, this.age);
        if (this.name.equalsIgnoreCase(student.name)) return -1 * (this.name.compareTo(student.name));
        return Integer.compare(this.id, student.id);

    }

}
