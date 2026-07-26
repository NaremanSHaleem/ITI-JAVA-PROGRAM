public class Complex<T extends Number> {
    private T real;
    private T imag;

    public Complex(T real, T imag) {
        this.real = real;
        this.imag = imag;
    }

    public static <T extends Number> Complex<Double> add(Complex<T> c1, Complex<T> c2) {
        double real = c1.real.doubleValue() + c2.real.doubleValue();
        double imag = c1.imag.doubleValue() + c2.imag.doubleValue();
        return new Complex<>(real, imag);
    }

    public static <T extends Number> Complex<Double> sub(Complex<T> c1, Complex<T> c2) {
        double real = c1.real.doubleValue() - c2.real.doubleValue();
        double imag = c1.imag.doubleValue() - c2.imag.doubleValue();
        return new Complex<>(real, imag);
    }

    @Override
    public String toString() {
        return real + "," + imag;
    }
}
