package capitulo10.ejercicio.pkg8;

public class Capitulo10Ejercicio8 {

    public static void main(String[] args) {
        /*CollagueCourse c1 = new CollagueCourse("ENG", 1001, 3);
        LabCourse c2 = new LabCourse("BIO", 1001, 3);
        CollagueCourse c3 = new LabCourse("CHM", 1001, 3);
        System.out.println(c1.display());
        System.out.println(c2.display());
        System.out.println(c3.display());*/

        String dept = "BIO";
        Integer coursenumber = 1001;
        Integer credits = 2;

        if (dept.equals("BIO") || dept.equals("CHM") || dept.equals("CIS") || dept.equals("PHY")) {
            LabCourse course1 = new LabCourse(dept, coursenumber, credits);
            System.out.println(course1.display());
        } else {
            CollagueCourse course1 = new CollagueCourse(dept, coursenumber, credits);
            System.out.println(course1.display());
        }
        System.out.println("******************\n");
        String dept1 = "ENG";
        Integer coursenumber1 = 1001;
        Integer credits1 = 2;

        if (dept1.equals("BIO") || dept1.equals("CHM") || dept1.equals("CIS") || dept1.equals("PHY")) {
            LabCourse course2 = new LabCourse(dept1, coursenumber1, credits1);
            System.out.println(course2.display());
        } else {
            CollagueCourse course2 = new CollagueCourse(dept1, coursenumber1, credits1);
            System.out.println(course2.display());
        }
    }
}

