
class Course {
    private String name;
    private String enrollType;
    private Integer numberOfStudentsEnrolled;
    private Lecturer lecturerInCharge;
    private Degree degreeBelongsTo;

    public Course(String name, String enrollType) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = 0;
    }

    public void displayInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Enroll Type: " + enrollType);
        System.out.println("Number of Students Enrolled: " + numberOfStudentsEnrolled);
        System.out.println("Lecturer In Charge: " + (lecturerInCharge != null ? lecturerInCharge.getName() : "None"));
        System.out.println("Degree Belongs To: " + (degreeBelongsTo != null ? degreeBelongsTo.getName() : "None"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollType() {
        return enrollType;
    }

    public void setEnrollType(String enrollType) {
        this.enrollType = enrollType;
    }

    public Integer getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }

    public void setNumberOfStudentsEnrolled(Integer numberOfStudentsEnrolled) {
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public void addLecturerInCharge(Lecturer lecturer) {
        this.lecturerInCharge = lecturer;
    }
}

