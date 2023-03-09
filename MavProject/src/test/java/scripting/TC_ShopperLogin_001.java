package scripting;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Before;
import org.testng.annotations.Test;

public class TC_ShopperLogin_001 {
	@Test
	public void removeProduct() throws Exception{
		File absFile = new File("/testData.Shopper.properties");
		FileInputStream fis = new FileInputStream(absFile);
		Properties prop = new Properties();
		prop.load(fis);
		
		
	}
}
