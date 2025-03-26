package Override.Task2;

public class Main {
    public static void main(String[] args) {
Phone phone = new Phone();
Laptop laptop = new Laptop();

phone.useDevice();
laptop.useDevice();
        System.out.println("Total Device: " + Device.deviceTotal);
    }
}
