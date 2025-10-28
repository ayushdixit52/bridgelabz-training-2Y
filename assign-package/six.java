

class Student {
    private String name;
    private double marks1, marks2, marks3;

    // Constructor
    public Student(String name, double marks1, double marks2, double marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Getters
    public String getName() { return name; }
    public double getMarks1() { return marks1; }
    public double getMarks2() { return marks2; }
    public double getMarks3() { return marks3; }

    // toString method
    @Override
    public String toString() {
        return "Student Name: " + name + "\n"
             + "Marks: " + marks1 + ", " + marks2 + ", " + marks3;
    }
}

class Analyzer {
    // Calculate average of marks
    public double calculateAverage(Student s) {
        return (s.getMarks1() + s.getMarks2() + s.getMarks3()) / 3.0;
    }

    // Determine grade from average
    public String findGrade(double avg) {
        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 60) return "C";
        else if (avg >= 50) return "D";
        else return "F";
    }
}

public class six {
    public static void main(String[] args) {
        Student s1 = new Student("Ayush Dixit", 85, 78, 92);

        Analyzer analyzer = new Analyzer();
        double avg = analyzer.calculateAverage(s1);
        String grade = analyzer.findGrade(avg);

        System.out.println("===== Student Performance Report =====");
        System.out.println(s1);
        System.out.println("Average Marks: " + avg);
        System.out.println("Grade: " + grade);
    }
}
