import java.util.function.Function;

public class PracticalExercise04 {
    public static void main(String[] args) {

        Function<Double, Double> CelsToFahr = c -> (c * 9 / 5) + 32;

        double celsiusTemperature = 26.5;
        double fahrenheit = CelsToFahr.apply(celsiusTemperature);

        System.out.println("Fahrenheit is: " + fahrenheit);
        

        // The quadratic equation
        double a = 2;
        double b = 4;
        double c = 2;
//        Function<Double, Double> GetFirstRootTest =  x -> (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        Function<Double, Double> GetFirstRoot = x -> (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        Function<Double, Double> GetSecondRoot = x -> (-b - Math.sqrt(b * b - 4 * a * c))/ (2 * a);

        System.out.println("First Root is: " + GetFirstRoot.apply(0.0));
        System.out.println("Second Root is: " + GetSecondRoot.apply(0.0));

    }
}
