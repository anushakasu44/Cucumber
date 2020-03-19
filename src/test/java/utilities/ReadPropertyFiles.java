package utilities;

import java.io.FileInputStream;
import java.util.Properties;





public class ReadPropertyFiles {

	

	public  String get(String Propertyname) throws Exception {
		String Propertyname1 = null;
		Properties property=new Properties();
		
		try {
		FileInputStream fis=new FileInputStream("./target/confg.properties");
		property.load(fis);
		 Propertyname1=property.getProperty(Propertyname);
		
		if(Propertyname1==null) {
			throw new Exception("propertynames"+Propertyname+"notfound");
		}
		
		}
		catch(Exception e){
			e.printStackTrace();
		
			
		}
		System.out.println(Propertyname1);
		return Propertyname1;
		
		
		
		
		
		
		
	}

	
}
