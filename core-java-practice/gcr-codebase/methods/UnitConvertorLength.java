package methods;
public class UnitConvertorLength {

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feetyards = 0.333333;
        return feet * feetyards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
    public static void main(String[] args) {
        System.out.println(convertYardsToFeet(10));
        System.out.println(convertFeetToYards(5));
        System.out.println(convertInchesToMeters(3));
        System.out.println(convertInchesToCentimeters(10));
    }
}
