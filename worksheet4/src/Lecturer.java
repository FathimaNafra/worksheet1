import java.util.ArrayList;

class Lecturer extends Person {
    private String position;
    private Department department;
    private ArrayList<Course> coursesTeaching;

    public Lecturer(String name, String position) {
        super(name);
        this.position = position;
        this.coursesTeaching = new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        System.out.println("Lecturer Name: " + getName());
        System.out.println("Position: " + position);
        if (department != null) {
            System.out.println("Department: " + department.getName());
        }
        System.out.println("Courses Teaching: " + listCoursesTeaching());
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void displayDepartmentInfo() {
        if (department != null) {
            department.displayInfo();
        } else {
            System.out.println("No department assigned.");
        }
    }

    public void addCourse(Course course) {
        coursesTeaching.add(course);
    }

    public void removeCourse(Course course) {
        coursesTeaching.remove(course);
    }

    public String listCoursesTeaching() {
        StringBuilder courseList = new StringBuilder();
        for (Course course : coursesTeaching) {
            courseList.append(course.getName()).append(", ");
        }
        return courseList.length() > 0 ? courseList.substring(0, courseList.length() - 2) : "None";
    }
}

