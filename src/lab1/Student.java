package lab1;

import java.util.HashMap;

import lombok.Data;

@Data
public class Student {
    private String name;
    private String nameGroup;
    private int course;
    private HashMap<String, Integer> grades;

    public Student(String nameGroup, String name, HashMap<String, Integer> grades, int course) {
        this.nameGroup = nameGroup;
        this.name = name;
        this.grades = new HashMap<>(grades);
        this.course = course;
    }

    @Override
    public String toString() {
        return "lab1.Student{" +
                "name='" + name + '\'' +
                ", nameGroup='" + nameGroup + '\'' +
                ", numberCourse=" + course +
                ", grades=" + grades +
                '}';
    }

    public double averageSumGrades() {
        HashMap<String, Integer> grades = this.grades;
        if (grades.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int value : grades.values()) {
            sum += value;
        }
        return (double) sum / grades.size();

    }

    public void nextCourseOfOneStud() {
        this.course++;
    }


}
