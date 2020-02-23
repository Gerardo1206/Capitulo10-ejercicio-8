package capitulo10.ejercicio.pkg8;

public class LabCourse extends CollagueCourse {
    public LabCourse(String department, Integer courseNumber, Integer credits){
        super(department,courseNumber,credits);
        super.addfee(50.0);
    }

    @Override
    public String display() {
        return "Lab Course:\n"+super.display(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
