package _SpringBoot.BootTest_4;


//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/root")
public class RestControllerDemo {
	
	@RequestMapping("/signin")
	//@ResponseBody
	public String view()
	{
		return "<h1><font color=crimson>Hello RestFul"
				+ "Services!!!";

	}
	@RequestMapping("/home")
	public String myMethod()
	{
		return "controller";
	}
	
}
