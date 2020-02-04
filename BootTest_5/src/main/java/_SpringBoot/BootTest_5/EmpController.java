package _SpringBoot.BootTest_5;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpController {
	
	@RequestMapping("/form1")
	public String getForm()
	{
		
		return "EmpForm";
	}
	
	@RequestMapping("/form2")
	public String getDetails(
			@RequestParam("employeeName")
			String EmployeeName1,
			@RequestParam("employeeEmail")
			String EmployeeEmail1,
			ModelMap modelMap)
	{
		Date current = new Date();
		modelMap.put("curtime", current);
		modelMap.put("emp_Name", EmployeeName1);
		modelMap.put("emp_Email", EmployeeEmail1);
		return "EmpView";
		
	}

	

}
