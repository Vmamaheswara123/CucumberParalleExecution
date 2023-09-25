package perPackages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver = null;
	static String baseurl = "https://rahulshettyacademy.com/locatorspractice/";
	
	
	public static void chrome_browserSetup() {
	String driverPath = "D:\\WorkSpace_Repo\\CucumberParalleExecution\\Drivers\\chromedriver.exe";
	String url = "https://rahulshettyacademy.com/locatorspractice/";
	System.setProperty("webdriver.chrome.driver", driverPath);

	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	navigateUrl(baseurl);
	
	}
	
	public static void geko_browserSetup() {
	String driverPath = "D:\\WorkSpace_Repo\\CucumberParalleExecution\\Drivers\\chromedriver.exe";
	String url = "https://rahulshettyacademy.com/locatorspractice/";
	System.setProperty("webdriver.chrome.driver", driverPath);

	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	navigateUrl(baseurl);
	}
	
	public static void edge_browserSetup() {
	String driverPath = "D:\\WorkSpace_Repo\\CucumberParalleExecution\\Drivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);

	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	navigateUrl(baseurl);
	}
	
	public static void navigateUrl(String url) {
		driver.get(url);
	}
	
	public static void tearDown() {
		driver.close();
	}
}
