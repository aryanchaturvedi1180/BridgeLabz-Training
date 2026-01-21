package generics.CourseManagementSystem;

public class AssignmentCourse extends CourseType {

    AssignmentCourse(String courseName) {
        super(courseName);
    }

    void evaluate() {
        System.out.println(courseName + " evaluated using assignments");
    }
}
