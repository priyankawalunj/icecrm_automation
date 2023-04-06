package com.icehrm_automation.utility;

// example for Property Handling Implementation

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertyHandling {
Properties propertise;


public PropertyHandling() {
	try   {
		//config.propertise file path
		String filepath =System.getProperty("user.dir")+"/config.propertise";
		FileInputStream file =new FileInputStream (filepath);
		propertise =new Properties();
		propertise.load(file);      //load the file in properties class to retriver volues
	}
	catch (IOException e) {
		throw new RuntimeException(e) ;
		}
	} 
	public String grtproperty(String key) {
		String value= propertise.getProperty(key);
		System.out.println (value);
		return value;
}
	public void fileupload(String filepath) {
		try {
			PropertyHandling handling = new PropertyHandling();
			String autoItScript = handling.getproperties("autoItScript");
			Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
			}
	
			}
	
	
	
	public static String getproperty(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	public String getproperties(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	


}
