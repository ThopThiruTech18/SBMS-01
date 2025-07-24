package in.thiru.settr;

public class PetrolEngineImpl implements IEngine {
	
	public PetrolEngineImpl() {
		System.out.println("PetrolEngineImpl::0-param Constructor");
	}

	@Override
	public int start() {
		
		return 1;
	}

}
