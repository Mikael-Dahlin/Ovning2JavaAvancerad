package lektion2;

/**
 * 
 * @author mikael
 * Class that contains information about cars.
 */
public class Bil {

	// Declare variables.
	private String name;
	private float fuelConsumption;
	private float carbonEmission;

	/*
	 * Constructor that receives data for all variables. 
	 */
	public Bil(String _name, float _fuelConsumption, float _carbonEmission) {
	
		this.name = _name;
		this.fuelConsumption = _fuelConsumption;
		this.carbonEmission = _carbonEmission;
	}

	/*
	 * Getters and setters for all variables.
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(float fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public float getCarbonEmission() {
		return carbonEmission;
	}

	public void setCarbonEmission(float carbonEmission) {
		this.carbonEmission = carbonEmission;
	}
}
