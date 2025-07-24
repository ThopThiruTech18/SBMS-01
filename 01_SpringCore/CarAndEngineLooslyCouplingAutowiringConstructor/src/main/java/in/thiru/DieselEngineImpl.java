package in.thiru;

public class DieselEngineImpl implements IEngine {
	
	
	public DieselEngineImpl() {
		System.out.println("DieselEngineImpl :: 0-Param Constructor");
	}

	@Override
	public boolean start() {
		
		System.out.println("Engine is started");
		return false;
	}

}
