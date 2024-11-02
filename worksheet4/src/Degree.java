

import java.util.ArrayList;

class Degree {
    private String name;
    private Integer numberOfStudents;
    private ArrayList<Course> coursesOffering;

    public Degree(String name) {
        this.name = name;
        this.numberOfStudents = 0;
        this.coursesOffering = new ArrayList<>();
    }

    public void displayInfo() {
        System.out.println("Degree Name: " + name);
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Courses Offering: " + listCoursesOffering());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(Integer numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
    }

    public String listCoursesOffering() {
        StringBuilder courseList = new StringBuilder();
        for (Course course : coursesOffering) {
            courseList.append(course.getName()).append(", ");
        }
        return courseList.length() > 0 ? courseList.substring(0, courseList.length() - 2) : "None";
    }
}
