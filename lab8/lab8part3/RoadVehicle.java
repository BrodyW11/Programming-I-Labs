//Road vehicle is a sub class of Transport
//Allows RoadVehicle to provide method implementations among several closely related classes
//Classes extending RoadVehicle are expected to have common methods as Transport like access methods
public interface RoadVehicle {
	//Declare methods to control a road vehicle
	public void changeGear (int newGear);
	public void accelerate (int speedUp);
	public void brake (int speedDown);
}
