package in.thiru.settr;

public class CarMain {

	public static void main(String[] args) {

		
		
		Car car = new Car();
		car.setEngine(new PetrolEngineImpl());
		car.drive();

	}

}
