package _SpringBoot.BootTest_7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
	
	@Autowired
	public EmployeeDao dao;

	@RequestMapping("/jspmysql")
    public String listOfEmployee(Model model) {
          List<EmployeePojo> employeeList = dao.isData();
          model.addAttribute("empList", employeeList);
          return "jdbc";
    }
    @RequestMapping(value="/deleteemp/{delno}",
    		method = RequestMethod.GET)    
    public String deleteEmp(
    		@PathVariable 
    		int delno)
    {   
    	dao.delete1(delno);    
    	return "Delete";
    }


}
