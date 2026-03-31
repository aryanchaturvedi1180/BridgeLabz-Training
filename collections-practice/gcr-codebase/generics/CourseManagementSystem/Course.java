package generics.CourseManagementSystem;
import java.util.*;

public class Course<T extends CourseType> {

    List<T> courses = new ArrayList<>();

    void addCourse(T course) {
        courses.add(course);
    }

    List<T> getCourses() {
        return courses;
    }
}
