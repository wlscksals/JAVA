package CH21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C11SelenumAPImain {
	private static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	private static final String WEB_DRIVER_PATH = "C:\\Users\\wlsck\\git\\JAVA\\src\\Driver\\chromedriver-win32\\chromedriver.exe";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		
		ChromeOptions options = new ChromeOptions();
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.naver.com");
	}

}
