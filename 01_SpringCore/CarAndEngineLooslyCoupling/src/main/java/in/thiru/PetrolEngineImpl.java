package in.thiru;

public class PetrolEngineImpl implements IEngine {
	
	
	public PetrolEngineImpl() {
		System.out.println("PetrolEngine :: 0-Param Constructor");
	}

	@Override
	public boolean start() {
		
		System.out.println("PetrolEngine is started");
		return true;
	}

}
