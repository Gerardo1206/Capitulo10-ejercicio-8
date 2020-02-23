package capitulo10.ejercicio.pkg8;

public class CollagueCourse {
    private String department;
    private Integer courseNumber;
    private Integer credits;
    private Double feeOfCourse;

    public CollagueCourse(String department, Integer courseNumber, Integer credits) {
        this.department = department;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.feeOfCourse=120.0*this.credits;
    }

    public void addfee(double fee){
        this.feeOfCourse+=fee;
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(Integer courseNumber) {
        this.courseNumber = courseNumber;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public Double getFeeOfCourse() {
        return feeOfCourse;
    }

    public void setFeeOfCourse(Double feeOfCourse) {
        this.feeOfCourse = feeOfCourse;
    }
    
    public String display(){
        return "CollagueCourse:" + 
                "\ndepartment=" + department+
                "\ncourseNumber=" + courseNumber +
                "\ncredits=" + credits + 
                "\nfeeOfCourse=" + feeOfCourse;
    }
    
}
