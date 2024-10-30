import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;
    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }
    public int getDegree() {
        return coeffs.length;
    }

    @Override
    public String toString() {
        return "MyPolynomial{" +
                "coeffs=" + Arrays.toString(coeffs) +
                '}';
    }
    public double evaluate( double x){
        return coeffs[getDegree()-1]*x;
    }
    public MyPolynomial add(MyPolynomial right){
        return null;
    }
    public MyPolynomial multiply(MyPolynomial right){
        return null;
    }
}
