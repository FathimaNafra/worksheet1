import java.util.ArrayList;

class Department {
    private String name;
    private Lecturer departmentHead;
    private ArrayList<Course> coursesOffering;
    private ArrayList<Lecturer> lecturersBelongsTo;

    public Department(String name) {
        this.name = name;
        this.coursesOffering = new ArrayList<>();
        this.lecturersBelongsTo = new ArrayList<>();
    }

    public void displayInfo() {
        System.out.println("Department Name: " + name);
        System.out.println("Department Head: " + (departmentHead != null ? departmentHead.getName() : "None"));
        System.out.println("Courses Offering: " + listCoursesOffering());
        System.out.println("Lecturers: " + listLecturers());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void appointDepartmentHead(Lecturer lecturer) {
        this.departmentHead = lecturer;
    }

    public void displayDepartmentHeadInfo() {
        if (departmentHead != null) {
            departmentHead.displayInfo();
        } else {
            System.out.println("No department head assigned.");
        }
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
    }

    public void addLecturer(Lecturer lecturer) {
        lecturersBelongsTo.add(lecturer);
    }

    public void removeLecturer(Lecturer lecturer) {
        lecturersBelongsTo.remove(lecturer);
    }

    public String listCoursesOffering() {
        StringBuilder courseList = new StringBuilder();
        for (Course course : coursesOffering) {
            courseList.append(course.getName()).append(", ");
        }
        return courseList.length() > 0 ? courseList.substring(0, courseList.length() - 2) : "None";
    }

    public String listLecturers() {
        StringBuilder lecturerList = new StringBuilder();
        for (Lecturer lecturer : lecturersBelongsTo) {
            lecturerList.append(lecturer.getName()).append(", ");
        }
        return lecturerList.length() > 0 ? lecturerList.substring(0, lecturerList.length() - 2) : "None";
    }
}
