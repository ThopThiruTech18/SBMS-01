package in.thiru.constr;

public class CarMain {

	public static void main(String[] args) {

		Car car = new Car(new PetrolEngineImpl());
		car.drive();

	}

}
