package TestNgPackage;

import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class NewTest {
	WebDriver driver;
	
	
  @Test
  public void f() throws Exception {
	  
	  driver=new ChromeDriver();
	  
	  driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
	  
/*	  String URL=driver.getCurrentUrl();
	  
	  String title=driver.getTitle();
	  System.out.println(URL+"   "+title);
	  
	 //
	  
	  driver.get("https://github.com/");
	  
	  driver.navigate().to("https://www.google.co.in/");
	  
	  driver.navigate().back();
	  
	  driver.navigate().forward();
	  
	  driver.navigate().refresh();
	  

	  
	  
	  
	  
	  
	  driver.close();*/
	  
	  driver.manage().window().maximize();
	  System.out.println("Testing GitHub Changes");
	  
	  
/*	  Dimension obj=driver.findElement(By.xpath("//*[@placeholder='Pick a username']")).getSize();
	  
	  
	 System.out.println("Height is "+obj.getHeight()); 
	  
	  obj.getWidth();
	  Point obj1=driver.findElement(By.xpath("//*[@placeholder='Pick a username']")).getLocation();
	  
	  obj1.getX();
	  
	  obj1.getY();
	  */
	/*  
	  List<WebElement> li=driver.findElements(By.tagName("input"));
	  
	  
	  int count=li.size();
	  
	  for(int i=1;i<count;i++)
	  {
		  System.out.println(li.get(i).getAttribute("id"));
		  
		  
		  
		  
	  }
	  */
	  
/*	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  WebDriverWait wait=new WebDriverWait(driver,20);*/
	  
	  //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='Pick a username']")));
	
/*	  FileInputStream fis=new FileInputStream("C:\\Users\\Jyotsnsa Arora\\workspace\\MavenProjectArtifactId\\OR.properties");
	  
	  
	  Properties prop=new Properties();
	  
	  prop.load(fis);
	  
	  
	  driver.findElement(By.xpath(prop.getProperty("Signin"))).click();*/
	  
/*	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("tutorial");
	  
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tutorial");
	  
	  driver.findElement(By.xpath("//*[@name='login']")).click();
	  
	 if(driver.findElement(By.xpath("//*[@value='roundtrip']")).isSelected())
{
		 driver.findElement(By.xpath("//*[@value='oneway']")).click();
	driver.findElement(By.xpath("//*[@value='Business']")).click();
}
	 
	 //driver.findElement(By.xpath("//select[@name='airline']//following::option[3]")).click();
	 
	 Select obj=new Select(driver.findElement(By.xpath("//select[@name='airline']")));
	 
	 
	 
	 List<WebElement> li=obj.getOptions();
	 System.out.println(li.size());
	 //Unified Airlines
	 
	 for(int i=0;i<li.size();i++)
	 {
		 System.out.println(li.get(i).getText());
		 if(li.get(i).getText().equalsIgnoreCase("Unified Airlines"))
		 {
			 li.get(i).click();
			
		 }
	 }
	  
	  
	 driver.findElement(By.xpath("//*[@name='findFlights']")).click();
	 
	 //reserveFlights
	 driver.findElement(By.xpath("//*[@name='reserveFlights']")).click();
	 
	 if(!driver.findElement(By.xpath("//*[@name='billAddress1']//preceding::*[@name='ticketLess']")).isSelected())
	 {
		 driver.findElement(By.xpath("//*[@name='billAddress1']//preceding::*[@name='ticketLess']")).click();
	 }
	  Thread.sleep(5000);
	  if(driver.findElement(By.xpath("//*[@name='billAddress1']//preceding::*[@name='ticketLess']")).isSelected())
		 {
			 driver.findElement(By.xpath("//*[@name='billAddress1']//preceding::*[@name='ticketLess']")).click();
		 }
	  */
	  
/*	  driver.findElement(By.xpath("//select[@id='Carlist']//following::option[@id='car4']")).click();
	  Select obj=new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
	  List<WebElement> li=obj.getOptions();
	  
	  for(int i=0;i<li.size();i++)
	  {
		  if(li.get(i).getText().equalsIgnoreCase("India"))
		  {
			  li.get(i).click();
			  driver.findElement(By.xpath("//select[@name='FromLB']//following::input[1]")).click();
			  
			  
		  }

	  }
	  */
/*	  
	  List<WebElement> tr=driver.findElements(By.xpath("html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/table/tbody/tr"));
	 List<WebElement> td=driver.findElements(By.xpath("html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/table/tbody/tr[1]/td"));
	 
	  System.out.println(tr.size());
	
	
	 System.out.println(td.size());
	 
	 
	 for(int i=1;i<=tr.size();i++)
	 {
		 for(int j=1;j<=td.size();j++)
		 {
			 System.out.print(driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText());
			 
			 System.out.print("   ");
			 
		 }
		 System.out.println("");
	 }
	  */
/*	  driver.findElement(By.xpath("//button[text()='Show Me Confirmation']")).click();
	  
	  Alert al=driver.switchTo().alert();
	  
	  
	  
	  System.out.println(al.getText());
	  Thread.sleep(5000);
	  al.accept();
	  
	  driver.findElement(By.xpath("//*[@value='Show Me Alert']")).click();
	  Alert al1=driver.switchTo().alert();
	  
	  
	  
	  System.out.println(al1.getText());
	  Thread.sleep(5000);
	  al1.accept();
	  driver.switchTo().defaultContent();
	  driver.findElement(By.xpath("//*[text()='Show Me Prompt']")).click();
	  Thread.sleep(5000);
	  
	  Alert al4=driver.switchTo().alert();
	  Thread.sleep(5000);
	  al4.accept();
	  
	  driver.findElement(By.xpath("//*[text()='Show Me Prompt']")).click();

	  
	  Alert al2=driver.switchTo().alert();
	  Thread.sleep(5000);
	  al2.sendKeys("Sourabh");
	  Thread.sleep(5000);
	  System.out.println(al2.getText());
Robot rob=new Robot();

rob.keyPress(KeyEvent.VK_TAB);
Thread.sleep(5000);
rob.keyPress(KeyEvent.VK_SPACE);
Thread.sleep(5000);
rob.keyPress(KeyEvent.VK_TAB);
Thread.sleep(5000);
rob.keyPress(KeyEvent.VK_ENTER);
*/
/*Thread.sleep(10000);
	  driver.switchTo().frame("iframe_Login");
	  
	  driver.findElement(By.xpath("//*[@name='Email']")).sendKeys("sunny@gmail.com");
	  Thread.sleep(5000);
	  driver.switchTo().defaultContent();*/

/*driver.findElement(By.xpath("//*[@name='img']")).click();




Runtime.getRuntime().exec("auto.exe");
*/

/*	 List<WebElement> obj=driver.findElements(By.xpath("//select[@name='airline']"));
	 
	 
	 System.out.println(obj.size());*/
/*Thread.sleep(5000);
	  Actions act=new Actions(driver);
	 driver.findElement(By.xpath("//a[text()='Home']")).click();
	  
	  WebElement main=driver.findElement(By.xpath("//a[text()='Selenium']"));
	  
	  act.moveToElement(main).build().perform();*/
	  
	 // act.click(driver.findElement(By.xpath("//a[text()='Selenium Basic']"))).build().perform();
	  //**********************Drag and Drop***********************************************
	  
/*	WebElement obj=driver.findElement(By.xpath("//*[@id='draggable']"));
	
	WebElement obj1=driver.findElement(By.xpath("//*[@id='droppable']"));
	
	Actions act=new Actions(driver);
	Screenshot.scree(driver);
	act.dragAndDrop(obj,obj1).build().perform();*/
	
	//*************************Executing Java Script*********************
	
/*	JavascriptExecutor j=(JavascriptExecutor)driver;
	
	j.executeScript("return", arg1)*/
	  
/*Screenshot.scree(driver);*/


	  //Assert.fail();
	  Set<String> hand=driver.getWindowHandles();
	  
	  Iterator<String> it=hand.iterator();
	  
	  while(it.hasNext()){
		  String win=it.next();
		  
		  System.out.println(win);
		  
		  driver.switchTo().window(win);
		  
		  
	  }
	  
	  
	  
  }
//  @AfterMethod
  public void SS(ITestResult result) throws IOException
  {
	  System.out.println("In screenshot method");
	  if(ITestResult.FAILURE==result.getStatus())
	  {
		  System.out.println("In If Condition");
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  
		  File src=ts.getScreenshotAs(OutputType.FILE);
		  
		  FileUtils.copyFile(src,new File("./Screenshot/"+result.getName()+".png"));
	  }
  }
}
