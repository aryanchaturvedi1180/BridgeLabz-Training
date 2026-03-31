public class Power {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        } 
        else if (n < 0) {
            return 1 / (x * myPow(x, -n - 1));
        }
        else if (n % 2 == 0) {
            double half = myPow(x, n / 2);
            double result = half * half;
            return result;
        }
        return x * myPow(x, n - 1);       
    }
}