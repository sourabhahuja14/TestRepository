package TestNgPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public static void scree(WebDriver driver) throws Exception
	{
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  
		  File src=ts.getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src,new File("./Screenshot/"+System.currentTimeMillis()+".png"));
	}

}
