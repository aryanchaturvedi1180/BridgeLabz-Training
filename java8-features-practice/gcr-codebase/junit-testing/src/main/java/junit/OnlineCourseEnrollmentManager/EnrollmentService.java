package junit.OnlineCourseEnrollmentManager;
import java.util.*;
import java.util.stream.Collectors;

public class EnrollmentService {

	private List<Enrollment> enrollment;
	
	public EnrollmentService(List<Enrollment> enrollment) {
		this.enrollment = enrollment;
	}
	
	// Filter enrollments based on a specific course
	public List<Enrollment> filterBySpecificCourse(String courseName) {
		return enrollment.stream().filter(e -> e.getCourseName()
				.equalsIgnoreCase(courseName)).collect(Collectors.toList());
	}
	
	//Filter enrollments based on course category
	public List<Enrollment> filterByCourseCategory(String courseCategory) {
		return enrollment.stream().filter(e -> e.getCourseCategory().
				equalsIgnoreCase(courseCategory)).collect(Collectors.toList());
	}
	
	//Group enrollments by course name
	public Map<String, List<Enrollment>> groupByCourseName() {
		return enrollment.stream().collect(Collectors.groupingBy(Enrollment::getCourseName));
	}
	
	//Count the number of enrollments per category
	public Map<String, Long> countByCategory() {
		return enrollment.stream().collect(Collectors.groupingBy(Enrollment::getCourseCategory,
				Collectors.counting()));
	}
	
	//Sort and display enrollments by enrollment date
	public List<Enrollment> sortByEnrollmentDate(){
		return enrollment.stream().sorted(Comparator.comparing(Enrollment::getEnrollmentDate)).
				collect(Collectors.toList());
	}
}