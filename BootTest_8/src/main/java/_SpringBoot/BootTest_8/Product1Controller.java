package _SpringBoot.BootTest_8;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Product1Controller {
			
		@ModelAttribute(name="testproduct")
		public Product1Pojo getProduct(
				@RequestParam int p1,
				@RequestParam String p2)
		{
			Product1Pojo pojo = new Product1Pojo();
			pojo.setProId(p1);
			pojo.setProName(p2);
			return pojo;
			
		}
		
		@RequestMapping(value="/viewproduct",method=RequestMethod.POST)
		public String submit(	
				@ModelAttribute(name="testproduct")
				Product1Pojo pp,
				ModelMap modelMap
				)
		{
			modelMap.addAttribute("proid", pp.getProId());
			modelMap.addAttribute("proname", pp.getProName());
			return "Product1View";
			
		}

}
