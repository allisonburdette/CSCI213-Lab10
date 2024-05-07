/**
 * Lab 10 Car class that extends vehicle
 *
 * @author Allison Burdette
 *
 */
 
public class Car extends Vehicle {
	
	private int numDoors;
	private int numPassengers;
	
	public Car(String make, String model, String plate, int doors, int passengers) {
		super(make, model, plate);
		this.numDoors = doors;
		this.numPassengers = passengers;
	}
	
	public int getNumDoors() {
		return this.numDoors;
	}
	
	public int getNumPassengers() {
		return this.numPassengers;
	}
	
	@Override
	public String toString() {
		String result = " ";
		result = String.format("%d-door %s %s with license %s", getNumDoors(), getMake(), getModel(), getPlate());
		return result;
	}
		
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Car)) {
			return false;
		}
		
		Car other = (Car) obj;
		if(this.numDoors == other.getNumDoors()) {
			if(this.numPassengers == other.getNumPassengers()) {
				return super.equals(obj);
			}
		}
		return false;
	}
	
	public Car copy() {
		String aMake = getMake();
		String aModel = getModel();
		String aPlate = getPlate();
		int numDoors = getNumDoors();
		int numPassengers = getNumPassengers();
		
		Car theCopy = new Car(aMake, aModel, aPlate, numDoors, numPassengers);
		return theCopy;
	}
}
	