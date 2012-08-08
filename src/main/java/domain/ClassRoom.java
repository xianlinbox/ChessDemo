package domain;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 5/18/12
 * Time: 9:54 AM
 */
public class ClassRoom {
    private List<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudent(String studentName) {
        for (Student student : students) {
            if(studentName.equals(student.getName())){
                return student;
            }
        }
        return null;
    }
}
