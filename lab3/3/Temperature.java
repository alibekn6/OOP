public class Temperature {
    private double degrees;
    private char scale;

    public Temperature() {
        this.degrees = 0.0;
        this.scale = 'C';
    }

    public Temperature(double degrees) {
        this.degrees = degrees;
        this.scale = 'C';
    }

    public Temperature(char scale) {
        validateScale(scale);
        this.degrees = 0.0;
        this.scale = scale;
    }

    public Temperature(double degrees, char scale) {
        validateScale(scale);
        this.degrees = degrees;
        this.scale = scale;
    }

    private static void validateScale(char scale) {
        if (scale != 'C' && scale != 'F') {
            throw new IllegalArgumentException("Scale must be 'C' or 'F'.");
        }
    }

    public double getCelsius() {
        return scale == 'C' ? degrees : 5.0 * (degrees - 32) / 9.0;
    }

    public double getFahrenheit() {
        return scale == 'F' ? degrees : (9.0 * degrees / 5.0) + 32;
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }

    public void setScale(char scale) {
        validateScale(scale);
        this.scale = scale;
    }

    public void set(double degrees, char scale) {
        validateScale(scale);
        this.degrees = degrees;
        this.scale = scale;
    }

    public char getScale() {
        return scale;
    }

    @Override
    public String toString() {
        return String.format("%.2f°%c (Celsius: %.2f, Fahrenheit: %.2f)",
                degrees, scale, getCelsius(), getFahrenheit());
    }

    public static void main(String[] args) {
        Temperature t1 = new Temperature();
        System.out.println("Default: " + t1);

        Temperature t2 = new Temperature(100, 'C');
        System.out.println("100°C: " + t2);

        Temperature t3 = new Temperature(212, 'F');
        System.out.println("212°F: " + t3);

        t1.set(37, 'C');
        System.out.println("Body temp: " + t1);
    }
}
