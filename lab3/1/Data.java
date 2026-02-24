public class Data {
    private double sum;
    private double max;
    private int count;

    public Data() {
        this.sum = 0.0;
        this.max = 0.0;
        this.count = 0;
    }

    public void addValue(double value) {
        sum += value;
        count++;
        if (count == 1 || value > max) {
            max = value;
        }
    }

    public double getAverage() {
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }

    public double getMax() {
        return max;
    }

    public int getCount() {
        return count;
    }
}