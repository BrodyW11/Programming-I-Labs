//All vehicles are a type of transport
//Allows Transport to provide method implementations among several closely related classes
//Classes extending Transport are expected to have common methods like access methods
public abstract class Transport {
	String model;
	int speed;
	
	public Transport(String model) {
	}
	
	//Set this the transport's model to be the name that is passed onto
	public void setModel(String model) {
	}
	
	//Get the model of the transport
	public String getModel() {
		return model;
	}
	
	//Method that allows inherited class to override
	//Let the transport make a noise
	public void pressHorn() {
	}
	
	//Increase speed of the transport with the speed passed into the method
	public void accelerate (int speedUp) {
	}
	
	//Decrease speed of the transport
	//Make sure the speed does not go into negative
	public void brake (int speedDown) {
	}
}
