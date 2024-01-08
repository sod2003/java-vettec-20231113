package Week08.HashCodeAssignment;

public class Student {
    private String firstName;
    private String lastName;
    private int studentId;
    private static int numberOfStudents;

    public Student() {
        this.studentId = ++numberOfStudents;
    }

    public Student(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + studentId;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return this.studentId == other.studentId;
    }

    @Override
    public String toString() {
        return "Student [" + firstName + ", " + lastName + ", studentId=" + studentId + "]";
    }
}
