package generics.CourseManagementSystem;

public class ResearchCourse extends CourseType {

    ResearchCourse(String courseName) {
        super(courseName);
    }

    void evaluate() {
        System.out.println(courseName + " evaluated using research work");
    }
}
