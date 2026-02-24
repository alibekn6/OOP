public class Car {

    public enum FuelType {
        PETROL, DIESEL, ELECTRIC, HYBRID
    }

    public static final int MAX_SPEED_LIMIT = 300;

    private static int totalCarsCreated = 0;

    private final String vin;

    private String model;
    private int year;
    private double mileage;
    private FuelType fuelType;

    {
        this.mileage = 0.0;
        totalCarsCreated++;
        System.out.println("A new car is being created. Total cars: " + totalCarsCreated);
    }

    public Car(String vin, String model, int year, FuelType fuelType) {
        this.vin = vin;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public Car(String vin, String model) {
        this(vin, model, 2024, FuelType.PETROL);
    }

    public void drive(double km) {
        if (km < 0) {
            System.out.println("Distance cannot be negative");
            return;
        }
        this.mileage += km;
        System.out.println(model + " drove " + km + " km Total mileage: " + mileage + " km");
    }

    public void drive(double km, String roadType) {
        if (km < 0) {
            System.out.println("Distance cannot be negative");
            return;
        }
        this.mileage += km;
        System.out.println(model + " drove " + km + " km on " + roadType + ". Total mileage: " + mileage + " km.");
    }

    public String getVin() {
        return vin;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getMileage() {
        return mileage;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public static int getTotalCarsCreated() {
        return totalCarsCreated;
    }

    @Override
    public String toString() {
        return String.format("Car{VIN='%s', model='%s', year=%d, mileage=%.1f, fuelType=%s}",
                vin, model, year, mileage, fuelType);
    }

    public static void main(String[] args) {
        Car car1 = new Car("ABC123", "Toyota Camry", 2023, FuelType.HYBRID);
        Car car2 = new Car("DEF456", "BMW X5");

        System.out.println(car1);
        System.out.println(car2);

        car1.drive(150);
        car1.drive(80, "highway");

        System.out.println("Max speed limit: " + Car.MAX_SPEED_LIMIT);

        System.out.println("Total cars created: " + Car.getTotalCarsCreated());

        System.out.println("Car1 VIN (read-only): " + car1.getVin());
    }
}