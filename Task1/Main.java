package Override.Task1;

public class Main {
    public static void main(String[] args) {
        Gasoline gasoline = new Gasoline();
        gasoline.Drive();
        Electric electric = new Electric();
        electric.Drive();
        System.out.println("Total Cars: " + Car.TotalCars);
    }
}
