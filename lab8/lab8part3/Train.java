//Train is a type of transport, but not a RoadVehicle
//Train is refuelable which extends Transport
public class Train extends Transport implements Refuelable{
	int fuel, fuelToAdd;
	
	public Train (String model) {
		super(model);
	}
	
	//Press the horn of the train
	//Print out the sound that the train makes
	@Override
	public void pressHorn() {
	}
	
	@Override
	//Print someone is speeding up the train
	//Increase the speed of the train by the speed passed into the method
	//Use an if statement to make sure the speed does not go over speed limit
	public void accelerate (int speedUp) {
	}
	
	@Override
	//Print someone is applying the brake
	//Decrease the speed of the train by the speed passed into the method
	//Avoid negative speed
	public void brake (int speedDown) {
	}
	
	//Refill the fuel of the train
	//Make sure the fuel does not overload the train
	public void refill() {
	}
}
