package lab1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Список всех студентов
        List<Student> students = new ArrayList<>();

        //Заполнение списка students
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Math", 4);
        grades.put("Physics", 3);
        grades.put("Biology", 5);
        grades.put("History", 4);
        grades.put("Russian", 5);

        students.add(new Student("О-22-ПИ", "Валентин", grades, 3));

        grades.put("Math", 5);
        grades.put("Physics", 5);
        grades.put("Biology", 5);
        grades.put("History", 5);
        grades.put("Russian", 5);

        students.add(new Student("О-23-ПИ", "Мария", grades, 2));

        grades.put("Math", 2);
        grades.put("Physics", 3);
        grades.put("Biology", 2);
        grades.put("History", 3);
        grades.put("Russian", 4);

        students.add(new Student("О-23-ПИ", "Игорь", grades, 2));

        grades.put("Math", 5);
        grades.put("Physics", 3);
        grades.put("Biology", 3);
        grades.put("History", 3);
        grades.put("Russian", 4);

        students.add(new Student("О-24-БИ", "Петр", grades, 1));

        System.out.println("Изначальный список студентов: ");
        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.println("----------");
        nextCourseOfAllStud(students);

        System.out.println("Список студентов после перевода на следующий курс: ");
        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.println("----------");
        printStudents(students, 3);
    }

    public static void nextCourseOfAllStud(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("Список студентов пуст");
        } else {
            for (Student student : students) {
                if (student.averageSumGrades() == 0) {
                    System.out.println("Отсутствуют оценки у студента " + student.getName() + " из группы" + student.getNameGroup());
                } else {
                    if (student.averageSumGrades() >= 3) {
                        student.nextCourseOfOneStud();
                    } else {
                        students.remove(student);
                    }
                }
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        if (students.isEmpty()) {
            System.out.println("Список студентов пуст");
        } else {
            System.out.println("Список студентов обучающихся на " + course + "-м курсе");
            for (Student student : students) {
                if (student.getCourse() == course) {
                    System.out.println(student.getName());
                }
            }
        }
    }
}
