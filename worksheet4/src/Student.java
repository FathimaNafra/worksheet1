import java.util.ArrayList;

class Student extends Person {
    private String studentID;
    private String year;
    private Degree degree;
    private ArrayList<Course> coursesEnrolled;

    public Student(String name, String studentID, String year) {
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.coursesEnrolled = new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + studentID);
        System.out.println("Year: " + year);
        if (degree != null) {
            System.out.println("Degree: " + degree.getName());
        }
        System.out.println("Courses Enrolled: " + listCoursesEnrolled());
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void registerDegree(Degree degree) {
        this.degree = degree;
    }

    public void displayDegreeInfo() {
        if (degree != null) {
            degree.displayInfo();
        } else {
            System.out.println("No degree registered.");
        }
    }

    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
    }

    public void unenrollCourse(Course course) {
        coursesEnrolled.remove(course);
    }

    public String listCoursesEnrolled() {
        StringBuilder courseList = new StringBuilder();
        for (Course course : coursesEnrolled) {
            courseList.append(course.getName()).append(", ");
        }
        return courseList.length() > 0 ? courseList.substring(0, courseList.length() - 2) : "None";
    }
}
