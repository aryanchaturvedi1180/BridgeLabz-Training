package generics.CourseManagementSystem;

public class ExamCourse extends CourseType {

    ExamCourse(String courseName) {
        super(courseName);
    }

    void evaluate() {
        System.out.println(courseName + " evaluated using exams");
    }
}
