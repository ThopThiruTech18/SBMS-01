package in.thiru.hasarel;

public class Car {
	
	public void drive()
	{
		Engine engine=new Engine();
		boolean isStarted = engine.start();
		
		if(isStarted)
		{
			System.out.println("Car Driving started...");
		}
		else
		{
			System.out.println("Failed to drive the car...");
		}
	}

}
