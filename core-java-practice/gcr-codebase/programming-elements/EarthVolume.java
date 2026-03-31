package gcr_codebase;

public class EarthVolume {
	public static void main(String[] args) {
		
		double radkm = 6378;
		double pi = 3.14;
		
		double volumeKm = (4.0 / 3.0) * pi * radkm * radkm * radkm;
		
		double radMiles = radkm / 1.6;
        double volMiles = (4.0 / 3.0) * pi * radMiles * radMiles * radMiles;

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + "cubic miles is " + volMiles);
        

	}

}
