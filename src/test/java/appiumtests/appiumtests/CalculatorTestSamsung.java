package appiumtests.appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorTestSamsung {
	
	//static AndroidDriver driver;

	public static void main(String[] args) throws Exception {
		
		openCalculator();

	}
	
	public static void openCalculator() throws Exception {
		AppiumDriver driver;
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Galaxy J5"); //any meaningful name will work
		cap.setCapability("udid", "1779a421"); //device id from cmd : adb devices
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "5.1.1");
		
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		//URL url = new URL("http://127.0.0.1:4723/wd/hub");
		URL url = new URL("http", "0.0.0.0", 4723, "/wd/hub");
		//driver = new AppiumDriver<MobileElement>(url, cap);
		driver = new AppiumDriver(url, cap);
		//AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(url, cap);
		System.out.println("Mob Application Started...");
	}

}
