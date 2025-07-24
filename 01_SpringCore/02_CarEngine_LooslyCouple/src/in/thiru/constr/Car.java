package in.thiru.constr;

public class Car {
	
	private IEngine engine;
	
	public Car() {
		System.out.println("Car :: 0-param");
	}
	
	public Car(IEngine pass) {
		this.engine = pass;
		System.out.println("Car :: param");
	}
	
	

	
	public void drive()
	{
		int start = engine.start();
		
		if(start >=1)
		{
			System.out.println("Car Driving started");
		}
		else
		{
			System.out.println("Car Driving failed");
		}
	}

	

}
