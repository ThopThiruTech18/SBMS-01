package in.thiru.settr;

public class Car {
	
	private IEngine engine;
	
	public Car() {
		System.out.println("Car :: 0-param");
	}
	
	public void setEngine(IEngine engine) {
		this.engine = engine;
		System.out.println("set engine");
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
