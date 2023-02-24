package NumadicTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
public class priti {
	@Test
	public void numadic() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\MyPractice\\NUMADICQAENGINEERTEST\\Driver\\chromedriver.exe" );
		WebDriver driver =(WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://jobs.numadic.com/jobs/Careers");
	JavascriptExecutor j=(JavascriptExecutor)driver;
	Thread.sleep(2000);
	j.executeScript("window.scrollBy(0,600)");
	String w =driver.findElement(By.xpath("//h2[text()='JOIN OUR CREW']")).getText();
   System.out.println(w);

WebElement dropDown=driver.findElement(By.xpath("//div[@class='cw-sticky-height']//lyte-drop-button"));
Actions act =new Actions(driver);
act.click(dropDown).perform();

  act.sendKeys(Keys.ARROW_DOWN).perform();
  act.sendKeys(Keys.ARROW_DOWN).perform();
  act.sendKeys(Keys.ARROW_DOWN).perform();
  act.sendKeys(Keys.ARROW_DOWN).perform();
  act.sendKeys(Keys.ENTER).perform();
  Thread.sleep(2000);
  WebElement QA=driver.findElement(By.xpath("//a[text()='QA Engineer']"));
  QA.click();
  
String actTitle=driver.getTitle();
String expTitle="Numadic Iot Pvt. Ltd. - QA Engineer in";
if(actTitle.equalsIgnoreCase(expTitle))
{
	System.out.println("pass");
}
else
{
	System.out.println("Fail");
}

WebElement interested=driver.findElement(By.xpath("(//lyte-yield[@yield-name='text'])[2]"));
interested.click();


JavascriptExecutor j1=(JavascriptExecutor)driver;
Thread.sleep(2000);
j1.executeScript("window.scrollBy(0,500)");

WebElement priti=driver.findElement(By.xpath("//div[@class=\"crc-form-field cnl-firstname-row \"]//lyte-drop-button"));
Actions act1 =new Actions(driver);
act1.click(priti).perform();

//  act1.sendKeys(Keys.ARROW_DOWN).perform();
//  act1.sendKeys(Keys.ARROW_DOWN).perform();
//  act1.sendKeys(Keys.ARROW_DOWN).perform();
//  act1.sendKeys(Keys.ARROW_DOWN).perform();
//  act1.sendKeys(Keys.ENTER).perform();

for(int i=0; i<=4;i++) 
{ 
act1.sendKeys(Keys.ARROW_DOWN).perform(); 
} 

Thread.sleep(3000); 

act1.sendKeys(Keys.ENTER).perform();


  WebElement priti1=driver.findElement(By.xpath("//crux-text-component[@id='rec-form_53264000000003149']//lyte-input"));
priti1.sendKeys("PRITI");
WebElement kale=driver.findElement(By.xpath("//div[@class=\"crc-form-row crc-rec-form_53264000000003151 \"]//lyte-input"));
kale.sendKeys("KALE");
WebElement email=driver.findElement(By.xpath("//div[@class=\"crc-form-row crc-rec-form_53264000000003155 \"]//input"));
email.sendKeys("pritikale2802@gmail.com");
WebElement mobileNo=driver.findElement(By.xpath("//div[@class='crc-form-row crc-rec-form_53264000000003161 ']//input"));
mobileNo.sendKeys("9284202802");
WebElement Street=driver.findElement(By.xpath("//div[@class=\"crc-form-row crc-rec-form_53264000000003169 \"]//input"));
Street.sendKeys("Opposite of Sakal Corporate Office, Natawadi");

JavascriptExecutor j3=(JavascriptExecutor)driver;
Thread.sleep(2000);
j3.executeScript("window.scrollBy(0,500)");

WebElement city=driver.findElement(By.xpath("//div[@class=\"crc-form-row crc-rec-form_53264000000003171 \"]//input"));
city.sendKeys("Pune");

WebElement State=driver.findElement(By.xpath("//div[@class=\"crc-form-row crc-rec-form_53264000000003173 \"]//input"));
State.sendKeys("Maharashtra");

WebElement postal=driver.findElement(By.xpath("//div[@class=\"crc-form-row crc-rec-form_53264000000003175 \"]//input"));
postal.sendKeys("411005");

WebElement Country=driver.findElement(By.xpath("//div[@class=\"crc-form-row crc-rec-form_53264000000003177 \"]//input"));
Country.sendKeys("India");


WebElement CurrentCompany=driver.findElement(By.xpath("//div[@class=\"crc-form-row crc-rec-form_53264000000003181 \"]//input"));
CurrentCompany.sendKeys("Tech Mahindra");


WebElement designation=driver.findElement(By.xpath("//div[@class='crc-form-row crc-rec-form_53264000000003183 ']//div[@class='crc-form-field  ']"));
Actions act2 =new Actions(driver);
act2.click(designation).perform();
Thread.sleep(2000);
//  act2.sendKeys(Keys.ARROW_UP).perform();
//  act2.sendKeys(Keys.ARROW_UP).perform();
//  act2.sendKeys(Keys.ARROW_UP).perform();
//  act2.sendKeys(Keys.ENTER).perform();

for(int i=0; i<=2;i++) 
{ 
act2.sendKeys(Keys.ARROW_DOWN).perform(); 
} 
act2.sendKeys(Keys.ENTER).perform();
  
  WebElement Skill=driver.findElement(By.xpath("//div[@class=\"crc-form-row crc-rec-form_53264000000003185 \"]//input"));
  Skill.sendKeys("Selenium using Java,API Testing using Postman,SOAPUI,Manual Testing - Functional and Non-Functional,JIRA,GitHub,etc");

  WebElement radio=driver.findElement(By.xpath("//div[@class='lytePopover lytePopoverVisible']//ul"));
  radio.click();

  WebElement CTC=driver.findElement(By.xpath("//div[@class=\"crc-form-row crc-rec-form_53264000000285107 \"]//input"));
  CTC.sendKeys("490000");
  
  WebElement Exp=driver.findElement(By.xpath("//div[@class=\"crc-form-row crc-rec-form_53264000000285115 \"]//input"));
  Exp.sendKeys("700000");
  
  
  JavascriptExecutor j4=(JavascriptExecutor)driver;
  Thread.sleep(2000);
  j4.executeScript("window.scrollBy(0,1800)");
  
  
  
  WebElement NP=driver.findElement(By.xpath("//div[@class=\"crc-form-row crc-rec-form_53264000000279001 \"]//input"));
  NP.sendKeys("15");
 Thread.sleep(2000);
  WebElement reason=driver.findElement(By.xpath("(//div[@class='crc-form-row  crc-section-53264000000002559_4 crc-form-sec ']//input)[2]"));
  reason.sendKeys("For Career Growth");

  WebElement why=driver.findElement(By.xpath("(//div[@class='crc-form-row  crc-section-53264000000002559_4 crc-form-sec ']//input)[3]"));
  why.sendKeys("For Career Growth");

  WebElement Linkdln=driver.findElement(By.xpath("//div[@class=\"crc-form-row crc-rec-form_111222333445 \"]//input"));
  Linkdln.sendKeys("http://www.linkedin.com/in/priti-k-7424a225a");

  
  
	}
	
}
