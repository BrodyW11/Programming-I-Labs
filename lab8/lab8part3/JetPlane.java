//JetPlane is a type of refuelable transport
//JetPlane is a subclass of transport and behave as a refuelable transport
public class JetPlane extends Transport implements Refuelable{
	int fuel, fuelToAdd
	
	public JetPlane(String model) {
		super(model);
	}
	
	//If the runway for plane is free
	//Return true
	public boolean isFree() {
		return true;
	}
	//Check if isFree() returns true and then take off
	//If taken off successfully, return true
	public boolean takeOff() {
		return true;
	}
	
	//Check if isFree() returns true then land
	//If landed successfully, return true
	public boolean landing() {
		return true;
	}
	
	//Method to refill the fuel
	//Make sure the fuel tank is not overloaded
	public void refill() {
	}
}
