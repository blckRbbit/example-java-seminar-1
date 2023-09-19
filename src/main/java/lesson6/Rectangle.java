package lesson6;

public class Rectangle implements AreaCalculator{
    double[] sides;

    public Rectangle(double[] sides) {
        this.sides = sides;
    }

    @Override
    public double calculateArea(double... args) {
        return args[0] * args[1];
    }
}
