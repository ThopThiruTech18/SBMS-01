package in.thiru.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.entity.Employee;
import in.thiru.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public void getAllEmployeeData() throws IOException {

		List<Employee> employees = employeeRepo.findAll();

		XSSFWorkbook workBook = new XSSFWorkbook();

		XSSFSheet sheet = workBook.createSheet("Employee_Sheet");

		XSSFRow row = sheet.createRow(0);

		row.createCell(0).setCellValue("EmployeeID");
		row.createCell(1).setCellValue("EmployeeName");
		row.createCell(2).setCellValue("EmployeeSalary");
		row.createCell(3).setCellValue("EmployeeLocation");
		

		int count = 1;
		for (Employee employee : employees) {

			XSSFRow row1 = sheet.createRow(count);

			row1.createCell(0).setCellValue(employee.getEmpId());
			row1.createCell(1).setCellValue(employee.getEmpName());
			row1.createCell(2).setCellValue(employee.getEmpSal());
			row1.createCell(3).setCellValue(employee.getEmpLoc());

			count++;
		}
		
		
		File f=new File("C:\\Users\\hp\\Desktop\\SBMS-01\\03_SpringDataJpa\\No09_EmployeeDataExportAsExcelSheetProject\\src\\main\\resources\\Employee.xlsx");
		
		FileOutputStream fos=new FileOutputStream(f);
		
		workBook.write(fos);
		
		fos.close();
	    workBook.close();

	    System.out.println("✅ Employee data exported successfully to Employee.xlsx");
	

	}

}
