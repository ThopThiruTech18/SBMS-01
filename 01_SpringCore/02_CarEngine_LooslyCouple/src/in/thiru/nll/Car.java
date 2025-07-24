package in.thiru.nll;

public class Car {
	
	
	
	private IEngine engine;
	
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
