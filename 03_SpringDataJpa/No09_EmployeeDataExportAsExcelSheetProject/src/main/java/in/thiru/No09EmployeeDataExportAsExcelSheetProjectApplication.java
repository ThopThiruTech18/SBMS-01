package in.thiru;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.service.IEmployeeService;

@SpringBootApplication
public class No09EmployeeDataExportAsExcelSheetProjectApplication {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ConfigurableApplicationContext run = SpringApplication.run(No09EmployeeDataExportAsExcelSheetProjectApplication.class, args);
		
		IEmployeeService bean = run.getBean(IEmployeeService.class);
		
		bean.getAllEmployeeData();
	}

}
