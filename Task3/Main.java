package Override.Task3;

public class Main {

    public static void main(String[] args) {
        Undergraduate u = new Undergraduate();
        u.displayInfo();
        Graduate g = new Graduate();
        g.displayInfo();
        System.out.println("Total Student:"+ Student.TotalStudents);
    }
}
