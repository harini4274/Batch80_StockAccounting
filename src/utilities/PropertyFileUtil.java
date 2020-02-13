package utilities;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtil 
{
	public  static String getValueForKey(String key) throws IOException
	
	{
	FileInputStream fis=new FileInputStream("D:\\selenium.harini\\stockaccountinghtbrid\\Propertiesfile\\Environment.properties");
	Properties configProperties=new Properties();
	configProperties.load(fis);
	return configProperties.getProperty(key);
	
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
