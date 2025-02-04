package wiproday2;
// using abstract class
abstract class vehicle {
	abstract void start();
	
	void stop() {
		System.out.println("Vehicle stopped.");
	}

}

class Car extends vehicle {
	@Override
	void start() {
		System.out.println("Car is starting with a key.");
	}
}