import static java.lang.Math.*;  // Example of static import

// --------------------- college.student ---------------------
class Student {
    private String name;
    private int rollNo;
    private String course;

    public Student(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

// --------------------- college.faculty ---------------------
class Faculty {
    private String name;
    private String subject;
    private double experience; // in years

    public Faculty(String name, String subject, double experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    public void displayFacultyInfo() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Experience: " + experience + " years");
    }
}

// --------------------- college.department ---------------------
class Department {
    private String deptName;
    private int numOfStudents;
    private int numOfFaculties;

    public Department(String deptName, int numOfStudents, int numOfFaculties) {
        this.deptName = deptName;
        this.numOfStudents = numOfStudents;
        this.numOfFaculties = numOfFaculties;
    }

    public void displayDepartmentInfo() {
        System.out.println("Department: " + deptName);
        System.out.println("Total Students: " + numOfStudents);
        System.out.println("Total Faculties: " + numOfFaculties);
    }
}

// --------------------- college.main ---------------------
public class ten {
    public static void main(String[] args) {

        System.out.println("===== COLLEGE MANAGEMENT SYSTEM =====\n");

        // Create Student objects
        Student s1 = new Student("Ayush Dixit", 101, "B.Tech CSE");
        Student s2 = new Student("Riya Sharma", 102, "B.Sc Physics");

        // Create Faculty objects
        Faculty f1 = new Faculty("Dr. Mohan Sharma", "Computer Networks", 10);
        Faculty f2 = new Faculty("Prof. Neha Verma", "Chemistry", 7);

        // Create Department objects
        Department d1 = new Department("Computer Science", 120, 10);
        Department d2 = new Department("Science", 80, 8);

        // Display info
        System.out.println("--- Student Information ---");
        s1.displayStudentInfo();
        System.out.println();
        s2.displayStudentInfo();

        System.out.println("\n--- Faculty Information ---");
        f1.displayFacultyInfo();
        System.out.println();
        f2.displayFacultyInfo();

        System.out.println("\n--- Department Information ---");
        d1.displayDepartmentInfo();
        System.out.println();
        d2.displayDepartmentInfo();

        System.out.println("\n--- Additional Info using Static Import ---");
        double randomScholarship = round(random() * 10000);  // Using Math.random() and Math.round()
        System.out.println("Scholarship amount generated randomly: ₹" + randomScholarship);

        System.out.println("\n===== PROJECT SUMMARY =====");
        System.out.println("Packages helped organize the project into logical sections:");
        System.out.println("1️⃣ college.student – for student-related data.");
        System.out.println("2️⃣ college.faculty – for faculty details.");
        System.out.println("3️⃣ college.department – for department statistics.");
        System.out.println("4️⃣ college.main – for the main application logic.");
        System.out.println("\nThis separation makes the system modular, maintainable, and easy to extend.");
    }
}

