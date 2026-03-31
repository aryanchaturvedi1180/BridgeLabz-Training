package generics.CourseManagementSystem;

public class Main {
    public static void main(String[] args) {

        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Mathematics"));
        examCourses.addCourse(new ExamCourse("Physics"));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("Software Engineering"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("AI Research"));

        System.out.println("Exam Courses:");
        CourseUtil.evaluateAll(examCourses.getCourses());

        System.out.println("\nAssignment Courses:");
        CourseUtil.evaluateAll(assignmentCourses.getCourses());

        System.out.println("\nResearch Courses:");
        CourseUtil.evaluateAll(researchCourses.getCourses());
    }
}
