package aa;

import io.appium.java_client.ios.IOSDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	@SuppressWarnings("rawtypes")
	 public static IOSDriver driver;
	
@BeforeTest
public void setup() throws MalformedURLException
{
	  
	 DesiredCapabilities caps = new DesiredCapabilities();
	 caps.setCapability("platformName", "iOS");
	 caps.setCapability("platformVersion", "10.2"); 
	 caps.setCapability("deviceName", "iPhone SE");
	 
	 //caps.setCapability("bundleid", "com.sybrant.DealGigCustomer");
	 caps.setCapability("app", "/Users/aravindhakumar/Downloads/DealGigCustomer.ipa"); 
	 
	 
	//caps.setCapability("bundleid", "com.example.apple-samplecode.UICatalog");
	 //caps.setCapability("app", "/Users/aravindhakumar/Library/Developer/Xcode/DerivedData/WebDriverAgent-folfazwwukpzfkegdblpnfuwlvfn/Build/Products/Debug-iphonesimulator/IntegrationApp.app"); 
	 driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	 
}
	
	
	
  @Test
  public void f() {
	  
	  
  }
}
