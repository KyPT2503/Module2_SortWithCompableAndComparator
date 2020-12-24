import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("B", 12));
        students.add(new Student("C", 12));
        students.add(new Student("A", 12));
        students.add(new Student("N", 12));
        students.add(new Student("Z", 12));
        students.add(new Student("T", 12));
        students.add(new Student("J", 12));
        System.out.println(students);

        /*Use comparable interface to sort*/
        Collections.sort(students);
        System.out.println(students);

        /*Use comparator interface to sort, and more flexible*/
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getName().compareTo(t1.getName());
            }
        });
        System.out.println(students);
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName()) * -1;
    }
}
