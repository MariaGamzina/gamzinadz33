public class BmiService {
    public int calculate(double heightMeter, double weightKilogram) {
        double index = weightKilogram / (heightMeter * heightMeter);
        return (int) index;
    }


}
