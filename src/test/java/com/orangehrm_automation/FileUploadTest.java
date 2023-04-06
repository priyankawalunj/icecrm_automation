package com.orangehrm_automation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icehrm_automation.loginpage.OrangeHrmLoginPage;
import com.icehrm_automation.utility.BaseClass1;
import com.icehrm_automation.utility.PropertyHandling;

public class FileUploadTest extends BaseClass1 {

	
	OrangeHrmLoginPage orangeHrmLoginpage;
	MyInfopage MyInfopage;
	PropertyHandling property;
	
	@BeforeClass
	public void beforClass() {
		orangeHrmLoginpage = new OrangeHrmLoginPage();
		myInfopage = new MyInfopage();
		property = new PropertyHandling();
		String username =property.getproperties("orangeHrmUN");
		String password =property.getproperties("orangeHrmPW");
		String browser =property.getproperties("browser");
		String url =property.getproperties("orangeHrmurl");
       luanchBrowser(browser);
      driver.get(url);
     orangeHrmLoginpage.login(username, password);
}
@Test
public void fileUpload() {
	click(myInfopage.myInfoMenu);
	click(myInfopage.profileImg);
	click(myInfopage.addImg);
this.fileUpload();

}
	private void OrangeHrmLoginPage() {
		// TODO Auto-generated method stub
		
	}
	
}
