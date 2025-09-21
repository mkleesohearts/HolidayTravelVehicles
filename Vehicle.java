public class Vehicle {
    private int vehicleSerialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private float baseCost;

    public Vehicle(int vehicleSerialNumber, String name, String model, int year, String manufacturer, float baseCost) {
        this.vehicleSerialNumber = vehicleSerialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    public void displayInfo() {
        System.out.println("Vehicle Serial Number: " + vehicleSerialNumber);
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Base Cost: " + baseCost);
    }
}