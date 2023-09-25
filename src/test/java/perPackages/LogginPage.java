package perPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LogginPage extends TestBase{

	
	public static void userEnters(String userName, String Password) {
		WebElement username = driver.findElement(By.xpath("//*[@id=\"inputUsername\"]"));
		username.clear();
		username.sendKeys(userName);
		WebElement password = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/input[2]"));
		password.clear();
		password.sendKeys(Password);
		WebElement singinbutton = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/button"));
		singinbutton.click();
	}

	public static void errorMes() {
		WebElement errormsg = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/p"));
		conditinalwait(errormsg, 30);
		boolean v = errormsg.isDisplayed();
		System.out.println(v);
		Assert.assertEquals(v, true);
	}

	public static void tearDown() {
		driver.close();
	}

	public static void conditinalwait(WebElement element, int TimeOut) {
		WebDriverWait wait = new WebDriverWait(driver, TimeOut);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void conditnalWait(WebElement element, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
