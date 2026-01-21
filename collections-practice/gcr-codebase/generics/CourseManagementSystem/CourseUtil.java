package generics.CourseManagementSystem;
import java.util.*;

public class CourseUtil {

    static void evaluateAll(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            c.evaluate();
        }
    }
}
