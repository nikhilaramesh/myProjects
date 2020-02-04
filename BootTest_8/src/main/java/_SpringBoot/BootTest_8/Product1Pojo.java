package _SpringBoot.BootTest_8;

import org.springframework.stereotype.Component;

@Component
public class Product1Pojo {
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
