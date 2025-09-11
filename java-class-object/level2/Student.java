public class Student {
    private String name;
    private int rollNumber, marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name; this.rollNumber = rollNumber; this.marks = marks;
    }
    public String grade() {
        if (marks >= 90) return "A+";
        else if (marks >= 75) return "A";
        else if (marks >= 60) return "B";
        else if (marks >= 40) return "C";
        else return "Fail";
    }
    public void display() {
        System.out.println(name+" | "+rollNumber+" | "+marks+" | Grade: "+grade());
    }
    public static void main(String[] args) {
        new Student("Ayush",101,88).display();
        new Student("Rohan",102,35).display();
    }
}

