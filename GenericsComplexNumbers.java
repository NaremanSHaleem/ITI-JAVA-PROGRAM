public class GenericsComplexNumbers {

    public static void main(String[] args) {
        Complex<Integer> c1 = new Complex<>(1, 2);
        Complex<Integer> c2 = new Complex<>(5, 1);


        System.out.println("Addition: " + Complex.add(c1, c2));
        System.out.println("Subtract: " + (Complex.sub(c2, c1)));
    }
    
}
