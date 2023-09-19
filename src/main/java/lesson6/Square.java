package lesson6;

public class Square implements AreaCalculator {

    @Override
    public double calculateArea(double... args) {
        return args[0] * args[0];
    }
}
