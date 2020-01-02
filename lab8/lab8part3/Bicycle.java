//Bicycle is a type of cycle and is transport
//It contains all abstract methods from Cycle and implements them
//Bicycle is not refuelable nor a road vehicle
public class Bicycle extends Transport implements Cycle {
	public Bicycle (String model) {
		super(model);
	}
	
	//Prints out the sound that a bell makes when it's rang
	public void ringBell() {
	}
	
	@Override
	//Print someone is paddling the bicycle
	//Increase the speed with the speed passed into this method
	//Make sure the speed of bicycle is reasonable
	public void accelerate(int speedUp) {
	}
	
	@Override
	//Print someone is applying the brake
	//Decrease speed of the bicycle with the speed passed into this method
	//Avoid having negative speed
	public void brake(int speedDown) {
	}
	
}
