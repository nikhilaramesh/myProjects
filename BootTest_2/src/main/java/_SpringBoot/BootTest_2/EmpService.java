package _SpringBoot.BootTest_2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmpService {
	
	@Value("${name}")
	String name;
	public String getName()
	{
		return getName1(name);
	}
	public String getName1(String n)
	{
		return "Hello" +n;
	}

	
}
