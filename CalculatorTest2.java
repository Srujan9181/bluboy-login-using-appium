package appiumtest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.MobileCapabilityType;


import org.openqa.selenium.remote.DesiredCapabilities;
public class CalculatorTest2 {
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities  cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION	,"9.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"127.0.0.1:5555");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator2");
		cap.setCapability("appPackage", "com.bluboy.android.test");
		cap.setCapability("appActivity", "com.bluboy.android.ui.splash.SplashActivity");
		@SuppressWarnings("deprecation")
		URL url=new URL("http://127.0.0.1:4724/");
		driver = new AppiumDriver<>(url,cap);
		try{
			MobileElement Allow=driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
			Allow.click();
			MobileElement location=driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
			if(location.isDisplayed()) {
				location.click();
			}
			
			
		}catch(NoSuchElementException e) {
			
			System.out.println("element not found");
		}
		finally {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			MobileElement MobileNumber=driver.findElementById("com.bluboy.android.test:id/editTextMobile");
			MobileNumber.sendKeys("9949721349");
			MobileElement CheckBox=driver.findElementById("com.bluboy.android.test:id/checkBoxLogin");
			CheckBox.click();
			MobileElement Signup=driver.findElementByXPath("//*[@text='SIGNUP / LOGIN']");
			Signup.click();
			try {
				MobileElement ok=driver.findElementById("com.bluboy.android.test:id/btnYes");
				ok.click();
				driver.executeScript("mobile: pressKey", Map.ofEntries(Map.entry("keycode", 4)));
				driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
				Signup.click();
			}catch(Exception e){
				System.out.println("Execution Continues");
			}
			
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			MobileElement otp=driver.findElementById("com.bluboy.android.test:id/pinView");
			otp.sendKeys("1111");
			MobileElement verify=driver.findElementByXPath("//*[@text='VERIFY']");
			verify.click();
			MobileElement Bell=driver.findElementById("com.bluboy.android.test:id/ivNotifications");
			Bell.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			MobileElement cs=driver.findElementById("com.bluboy.android.test:id/ivSupport");
			cs.click();
			Thread.sleep(10000);
			MobileElement Back=driver.findElementById("com.bluboy.android.test:id/imageViewBack");
			Back.click();
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			Back.click();
			Thread.sleep(10000);
			MobileElement Spin=driver.findElementById("com.bluboy.android.test:id/ivSpinWheel");
			Spin.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			cs.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Back.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Back.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			cs.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Back.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			MobileElement pp=driver.findElementById("com.bluboy.android.test:id/ivPlayerProfile");
			pp.click();
			MobileElement tournaments=driver.findElementById("com.bluboy.android.test:id/ivTournament");
			tournaments.click();
			MobileElement LeaderBoard=driver.findElementById("com.bluboy.android.test:id/ivLeaderBoard");
			LeaderBoard.click();
				
			
		}
		
		
		
	}
}
