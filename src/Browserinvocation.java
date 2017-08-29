import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browserinvocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://github.com/mozilla/geckodriver/releases
		
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver16.exe");
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setCapability("marionette", true);
		WebDriver driver=new FirefoxDriver(caps);
		driver.navigate().to("http://www.google.com");
	}

}
