public class TradeInVehicle {
    private int tradeSerialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private float baseCost;

    public TradeInVehicle(int tradeSerialNumber, String name, String model, int year, String manufacturer, float baseCost) {
        this.tradeSerialNumber = tradeSerialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }
}