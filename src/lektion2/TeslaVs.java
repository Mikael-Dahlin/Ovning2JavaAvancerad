package lektion2;

import java.util.ArrayList;

/**
 * 
 * @author mikael
 * Main class of the program contains the main and compareAndReturnPercent methods.
 */
public class TeslaVs {

	/*
	 * Main method that runs the program.
	 */
	public static void main(String[] args) {

		// Declares new arrayList that will be used for all the data.
		ArrayList<Bil> bilar = new ArrayList<Bil>();
		
		// Add car data to the arrayList.
		bilar.add(new Bil("Tesla", (float) 1.71, (float) 7.0));
		bilar.add(new Bil("Audi", (float) 4.9, (float) 114.0));
		bilar.add(new Bil("BMW", (float) 4.8, (float) 112.0));
		bilar.add(new Bil("Peugeot", (float) 3.8, (float) 88.0));
		
		// Printing program info.
		System.out.println("Tesla Vs cars");
		System.out.println("---------------");
		
		// Loop that compares the different cars.
		for (int i = 0; i < bilar.size(); i++) {
			for (int j = i + 1; j < bilar.size(); j++) {
				System.out.println();
				System.out.println(bilar.get(i).getName() + " vs " + bilar.get(j).getName());
				System.out.println("Fuel: " + compareAndReturnPercent(bilar.get(i).getFuelConsumption(), bilar.get(j).getFuelConsumption()) + "%");
				System.out.print("Carbon: " + compareAndReturnPercent(bilar.get(i).getCarbonEmission(), bilar.get(j).getCarbonEmission()) + "%");
				System.out.println(", " + (bilar.get(i).getCarbonEmission() - bilar.get(j).getCarbonEmission()) + " g/km");
			}
		}
		
		/*
		 * Data that was used for the lists:
		 * 
		 * Tesla
		 * 15.3 kWh (not used)
		 * 1.71 l/100km
		 * 7 (CO2, g/km)
		 * 
		 * Audi
		 * 4.9 l/100km
		 * 114 (CO2, g/km)
		 * 
		 * BMW
		 * 4.8 l/100km
		 * 112 (CO2, g/km)
		 * 
		 * Peugeot
		 * 3.8 l/100km
		 * 88 (CO2, g/km)
		 * 
		 */
	}
	
	/*
	 * Method for calculating percentage and rounding it to 2 decimals using string format.
	 */
	public static String compareAndReturnPercent(float x, float y) {
		String percent = String.format("%.2f", (double)(x / y * 100));
		return percent;
	}

/*	public static double compareAndReturnPercent1(float x, float y) {
	double percent = Math.round(x / y * 10000) / 100.00;
	return percent;
	}
*/
}

