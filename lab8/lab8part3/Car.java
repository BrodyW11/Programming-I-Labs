//Car is a refuelable road vehicle which extends transport
//Provide implementations for all of the abstract methods from RoadVehicle

public class Car extends Transport implements RoadVehicle, Refuelable {
	int gear;
	int fuel;
	String person;
	String [] passenger = new String[4];
	
	public Car(String model) {
		super(model);
	}
	
	//Press the car horn
	//Print out the horn that a car makes
	@Override
	public void pressHorn() {
	}
	
	//Set gear of the car to newGear
	public void changeGear (int newGear) {
	}
	
	@Override
	//Print someone is applying the gas paddle
	//Increase the speed of the car by the speed passed into the method
	//Use an if statement to make sure the speed does not go over speed limit
	public void accelerate (int speedUp) {
	}
	
	@Override
	//Print someone is applying the brake
	//Decrease the speed of the car by the speed passed into the method
	//Avoid negative speed
	public void brake (int speedDown) {
	}

	//Fill up the petrol of the car
	//Make sure the gas tank is not overloaded
	public void refill(int fuelToAdd) {
	}
}
