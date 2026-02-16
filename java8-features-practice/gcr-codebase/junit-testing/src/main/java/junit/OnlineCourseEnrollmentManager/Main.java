package junit.OnlineCourseEnrollmentManager;
import java.time.*;
import java.util.*;


public class Main {
	public static void main(String[] args) {
		List<Enrollment> list = Arrays.asList(
				new Enrollment("Aryan", "Java", "Programming", LocalDate.of(2025, 02, 16)),
				new Enrollment("Ayush", "Spring", "Programming", LocalDate.of(2023, 1, 26)),
				new Enrollment("Ashish", "Photoshop", "Design", LocalDate.of(2022, 6, 23)));
		
		EnrollmentService service = new EnrollmentService(list);
		System.out.println("Filtered (Programming):");
        service.filterByCourseCategory("Programming").forEach(System.out::println);

        System.out.println("\nGrouped By Course:");
        System.out.println(service.groupByCourseName());
        
        System.out.println("\nFiltered By Course (Java):");
        service.filterBySpecificCourse("Java").forEach(System.out::println);

        
        System.out.println("\nCount Per Category:");
        System.out.println(service.countByCategory());


        System.out.println("\nSorted By Date:");
        service.sortByEnrollmentDate().forEach(System.out::println);
	}
	
	
}
