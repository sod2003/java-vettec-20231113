package Week05.wrapperclasses;

import java.util.ArrayList;
// https://github.com/ericahicks/java-vettec-20231113/blob/main/WrapperClasses/src/com/skillstorm/groupwork/Student.java

public class Student {

	///////////////////////////////////////////////
	// Static properties
	private static long numberStudents = 0;

	///////////////////////////////////////////////
	// Instance properties
	private long studentId;

	private String name;

	private final ArrayList<String> grades;

	///////////////////////////////////////////////
	// Constructors
	public Student() {
		this("unknown");
	}

	public Student(String name) {
		this.name = name;
		this.studentId = numberStudents++;
		this.grades = new ArrayList<>();
	}

	///////////////////////////////////////////////
	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getStudentId() {
		return studentId;
	}

	public ArrayList<String> getGrades() {
		return new ArrayList<>(grades); // return a copy
	}

	///////////////////////////////////////////////
	// Methods
	public void addGrade(String grade) {
		if (!validGrade(grade))
			return;
		grades.add(grade);
	}

	static boolean validGrade(String grade) {
		if (grade == null || grade.isEmpty())
				return false;

	    return grade.toLowerCase().charAt(0) == 'a'
	    		|| grade.toLowerCase().charAt(0) == 'b'
	    		|| grade.toLowerCase().charAt(0) == 'c'
	    		|| grade.toLowerCase().charAt(0) == 'd'
	    		|| grade.toLowerCase().charAt(0) == 'f';
	}

	public void updateGrade(int index, String newGrade) {
		this.grades.set(index, newGrade);
	}

	public double calculateGPA() {
		double sum = 0;
		for (String s : grades) {
			sum += convert(s);
		}
		return sum / grades.size();
	}

	/**
	 *
	 * @param grade
	 * @return
	 * @throws IllegalArgumentException if grade is not A, B, C, D, or F
	 */
	public double convert(String grade) {
		if (!(grade.toLowerCase().charAt(0) == 'a'
	    		|| grade.toLowerCase().charAt(0) == 'b'
	    		|| grade.toLowerCase().charAt(0) == 'c'
	    		|| grade.toLowerCase().charAt(0) == 'd'
	    		|| grade.toLowerCase().charAt(0) == 'f')) {
			throw new IllegalArgumentException("Invalid grade: " + grade);
		}

		switch (grade) {
		case "A":
			return 4.0;
		case "B":
			return 3.0;
		case "C":
			return 2.0;
		case "D":
			return 1.0;
		case "F":
			return 0.0;
		default:
			return 0;
		}
	}

	@Override
	public String toString() {
		return String.format("Student %s has a gpa of %.2f", name, calculateGPA());
	}

}
