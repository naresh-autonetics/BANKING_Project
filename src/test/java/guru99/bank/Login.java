package guru99.bank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Desktop\\geckodriver-v0.27.0-win64\\geckodriver.exe");
      
     WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver_win32\\chromedriver.exe");
        //WebDriver driver=new ChromeDriver();
      driver.get("http://www.demo.guru99.com/V4/");
      System.out.println(driver.getTitle());
      driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr285290");
      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("YgybAjU");
      driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
      WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
      //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'Manger Id : mngr285290')]")));
      System.out.println(driver.findElement(By.xpath("//td[contains(text(),'Manger Id : mngr285290')]")).getText());
	}

}