package tydzien2_zadania4x;

public class LogikaKalkulatora {

	public static double fuelCost(double avgFuelConsumption, double fuelCostPerLiter, double distance) {

		double cost = (avgFuelConsumption * distance) * fuelCostPerLiter;

		return cost/100;
	}

}
