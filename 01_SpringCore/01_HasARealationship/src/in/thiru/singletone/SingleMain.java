package in.thiru.singletone;

public class SingleMain {
	
	public static void main(String[] args) {
		
		
		SingletonDemo instance1 = SingletonDemo.getInstance();
		SingletonDemo instance2 = SingletonDemo.getInstance();
		SingletonDemo instance3 = SingletonDemo.getInstance();
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		System.out.println(instance3.hashCode());
		
		
		
		
	}

}
