package in.thiru;

public class ElectricalEngineImpl implements IEngine {
	
	
	public ElectricalEngineImpl() {
		System.out.println("ElectricalEngineImpl :: 0-Param Constructor");
	}

	@Override
	public boolean start() {
		
		System.out.println("Engine is started");
		return false;
	}

}
