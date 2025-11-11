package in.thiru.service;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IEmployeeService {
	
	
	public void getAllEmployeeData() throws FileNotFoundException, IOException;
	
	public void getAllEmployeeHQL();
	
	public void getAllEmployeeSQL();
	
	public void getEmployeeSQL();
	public void getEmployeeHQL();
	
	
	
	void deleteEmployeeSQL();

}
