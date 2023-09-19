package lesson6;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main6 {

    public static void main(String ... args) {

//        Person ale = new Person("Alex", 50000);
//        Person alex1 = new Person("Alex", 50000);
//        Person alex = ale;
//        //       lesson6.Person@44af0743
//        System.out.println(ale);
//
//        System.out.println(ale.equals(alex1) );
//        System.out.println(ale == alex1);
//        System.out.println(alex == ale);

        Object o = new Person("Object", 3000);

        double[] values = new double[] {2,3};
        Function<String, Integer> intToStr = x -> Integer.parseInt(x);
        Supplier<String> supplier = () -> "string";
        System.out.println(supplier.get());
        AreaCalculator rectangle = new Rectangle(values);
//        System.out.println(rectangle.calculateArea(rectangle.calculateArea(values)));
//        int count = 0;
//        while (count < 100) {
//            //salary будет проинициализированно 1 раз и до конца цикла
//            alex.getSalary(); // а переменная i будет инициализироваться каждый раз
//            // при вызове метода и умирать после его завершения
//            count++;
//        };

//        System.out.println(alex.getSalary());

//        AreaCalculator rectangleAreaCalculator = arg -> arg[0] * arg[1];
        AreaCalculator triangleAreaCalc = x -> 0.5 * x[0] * x[1];

        System.out.println(triangleAreaCalc.calculateArea(3, 5));


    }
}
