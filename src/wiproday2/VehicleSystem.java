package wiproday2;

class Vehicle {
	void startEngine() {
		System.out.println("The vehicle's engine is starting...");
		
	}
}

class Car extends Vehicle {
	@Override
	void startEngine() {
		System.out.println("Car engine starts with a key or push button.");
		
	}
}
class Motorcycle extends Vehicle {
	@Override
	void startEngine() {
		System.out.println("Motorcycle engine starts with a self-start or kick.");
		
	}
}

public class VehicleSystem {
	public static void vehicleTestDrive(Vehicle vehicle) {
		vehicle.startEngine();
	}
	
	public static void main(String[] args) {
		Vehicle myCar = new Car();
		Vehicle myBike = new Motorcycle();
		
		vehicleTestDrive(myCar);
		vehicleTestDrive(myBike);
	}

}
