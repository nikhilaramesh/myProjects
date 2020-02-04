package _SpringBoot.BootTest_6;

import org.springframework.stereotype.Component;

@Component
public class ProductPojo {
	int proId;
	String proName;
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	

}
