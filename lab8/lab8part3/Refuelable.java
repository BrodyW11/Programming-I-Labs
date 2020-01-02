//Refuelable is a characteristic of transport
//Classes that extends Refuelable must also be a transport
//Allows Refuelable to provide method implementations among several closely related classes
public interface Refuelable{
	//Declare method to refill the fuel
	public void refill();
}
