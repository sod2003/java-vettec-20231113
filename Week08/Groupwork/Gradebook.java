package Week08.Groupwork;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Gradebook {
    private HashMap<Student, List<Double>> gradebook = new HashMap<>();

    public Gradebook() {}

    public Gradebook(HashMap<Student, List<Double>> gradebook) {
        this.gradebook = gradebook;
    }

    public static double calculateGrade(List<Double> grades) {
        double calculatedGrade = 0;
        for(double grade : grades) {
            calculatedGrade += grade;
        }
        return calculatedGrade / grades.size();
    }

    public Student findTopStudent() {
        Student topStudent = null;;
        for(Student student : gradebook.keySet()) {
            if(topStudent == null || calculateGrade(gradebook.get(student)) > calculateGrade(gradebook.get(topStudent))) {
                topStudent = student;
            }
        }
        return topStudent;
    }

    public double calculateClassAverage() {
        double average = 0;
        for(List<Double> grades : gradebook.values()) {
            average += calculateGrade(grades);
        }
        return average / gradebook.size();
    }

    public static double calculateWeightedGrade(List<Assignment> grades) {
        double mean = 0;
        for(Assignment assignment : grades) {
            mean += (assignment.score * assignment.weight);
        }
        return mean;
    }

    public static void main(String[] args) {
        Student std1 = new Student("Bobby", "Lee");
        Student std2 = new Student("Susie", "Brown");
        Student std3 = new Student("John", "Smith");
        System.out.println("Student Total: " + Student.getNumberOfStudents());

        Gradebook gradebook = new Gradebook();
        gradebook.gradebook.put(std1, new ArrayList<Double>(Arrays.asList(50.0, 70.0, 90.0)));
        gradebook.gradebook.put(std2, new ArrayList<Double>(Arrays.asList(90.0, 80.0, 90.0)));
        gradebook.gradebook.put(std3, new ArrayList<Double>(Arrays.asList(70.0, 70.0, 70.0)));
        System.out.println("Top Student: " + gradebook.findTopStudent());
        System.out.println(String.format("Class Average: %.2f", gradebook.calculateClassAverage()));
        
        // Bonus
        Assignment a1 = new Assignment("Homework", 90.0, 0.2);
        Assignment a2 = new Assignment("Research Paper", 75.0, 0.2);
        Assignment a3 = new Assignment("Final Exam", 80.0, 0.6);
        System.out.println("Weighted Average: " + calculateWeightedGrade(new ArrayList<Assignment>(Arrays.asList(a1, a2, a3))));
    }
}

class Assignment {
    String name;
    double score;
    double weight;

    public Assignment(String name, double score, double weight) {
        this.name = name;
        this.score = score;
        this.weight = weight;
    }
}