package HoorayHealthNativeApp;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;


public class Medical_Concierce_Page {

	public static void main(String[] args) throws Exception {
		
		//DesiredCapabilities Object create
		DesiredCapabilities dc = new DesiredCapabilities();
		
		//Mobile details
		dc.setCapability("deviceName","Redmi Note 7");
		dc.setCapability("udid","6a1ccc2d");
		//dc.setCapability("udid","192.168.0.100:5555");
		dc.setCapability("platformName","Android");
		dc.setCapability("platformVersion","10");
		
		//App details
		dc.setCapability("appPackage","com.hoorayhealthcare.asif.hoorayhealth");
		dc.setCapability("appActivity","com.hoorayhealthcare.asif.hoorayhealth.activity.SplashScreenActivity");
		
		//no reset
		dc.setCapability("noReset", "true");
		dc.setCapability("fullReset", "false"); 
		
		//Server setup
		URL server = new URL("http://127.0.0.1:4723/wd/hub"); 
		
		//AppiumDriver object creation & send DesiredCapabilities information & server details
		AppiumDriver MobileObj = new AppiumDriver(server,dc);
		
		System.out.println("**********Hooray Health App opening**********");
		
		//delay for 5 second
		Thread.sleep(5000);
	
		//Home to Medical Concierce
		WebElement MedicalConcierce = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/textViewMedicalConcierge"));
		MedicalConcierce.click();
        System.out.println("Home to Medical Concierce");
        Thread.sleep(1000);
        
        //***Action Target*** 
        //Call Medical Concierce Btn
        WebElement CallMedicalConcierceBtn = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_call_concierge_support"));    
        CallMedicalConcierceBtn.click();
		Thread.sleep(5000);
		System.out.println("Call Medical Concierce Btn -> Phone call page");
       
		MobileObj.navigate().back();
		MobileObj.navigate().back();
		MobileObj.navigate().back();
		
	}

}
