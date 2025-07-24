package in.thiru.isa;

public class Car extends Engine{
	
	public void drive()
	{
		boolean isStarted = super.start();
		
		
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
