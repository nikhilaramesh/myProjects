package _SpringBoot.BootTest_6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
	
	@ModelAttribute(name="testproduct")
	public ProductPojo getProduct(
			@RequestParam int p1,
			@RequestParam String p2)
	{
		ProductPojo pojo = new ProductPojo();
		pojo.setProId(p1);
		pojo.setProName(p2);
		return pojo;
		
	}
	
	@RequestMapping(value="/viewproduct",method=RequestMethod.POST)
	public String submit(	
			@ModelAttribute(name="testproduct")
			ProductPojo pp,
			ModelMap modelMap
			)
	{
		modelMap.addAttribute("proid", pp.getProId());
		modelMap.addAttribute("proname", pp.getProName());
		return "ProductView";
		
	}

}
