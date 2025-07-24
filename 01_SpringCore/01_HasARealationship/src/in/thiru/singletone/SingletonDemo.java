package in.thiru.singletone;

public class SingletonDemo {
	
	private static SingletonDemo instance;
	
	// our constructor should be private
	private SingletonDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonDemo getInstance()
	{
		if(instance==null)
		{
			instance=new SingletonDemo();
		}
		
		return instance;
	}
	
	
	
	
	

}
