package Week05.wrapperclasses;

import java.util.ArrayList;

public class StudentUtilities {
	
	/**
	 * For each student in the array, return the student with a 4.0 GPA
	 * 
	 * @param students A list of students
	 * @return A list of students with all A's
	 */
	public static ArrayList<Student> getStraightAStudents(ArrayList<Student> students) {
		if (students == null || students.size() == 0) {
			throw new IllegalArgumentException("Can't have Straight A Students if there's no Student list");
		}

		ArrayList<Student> straightAStudents = new ArrayList<Student>();
		for (Student stud : students) {
			if (stud.calculateGPA() == 4.0) {
				straightAStudents.add(stud);
			}
		}
		return straightAStudents;
	}
	
	public static ArrayList<Student> getStudentsInGoodStanding(ArrayList<Student> students) {
		if (students == null || students.size() == 0) {
			System.out.println("Can't have Good Standing Students if there's no Student list");
			return null;
		}

		ArrayList<Student> goodStandingStudents = new ArrayList<Student>();
		for (Student stud : students) {
			if (stud.calculateGPA() >= 2.5) {
				goodStandingStudents.add(stud);
			}
		}
		return goodStandingStudents;
	}

	public static ArrayList<Student> getStudentsInGoodStanding(ArrayList<Student> students, double gpa) {
		if (students == null || students.size() == 0) {
			System.out.println("Can't have Good Standing Students if there's no Student list");
			return null;
		}

		ArrayList<Student> goodStandingStudents = new ArrayList<Student>();
		for (Student stud : students) {
			if (stud.calculateGPA() >= gpa) {
				goodStandingStudents.add(stud);
			}
		}
		return goodStandingStudents;
	}
}
