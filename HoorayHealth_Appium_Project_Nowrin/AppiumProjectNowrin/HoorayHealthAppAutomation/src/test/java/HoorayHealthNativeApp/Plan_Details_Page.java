package HoorayHealthNativeApp;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;


public class Plan_Details_Page {

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
	
		//Home to Plan Details
		WebElement PlanDetails = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/textViewPlanDetails"));
		PlanDetails.click();
        System.out.println("Home to Plan Details");
        Thread.sleep(1000);
        
        //***Action Target*** 
        //Click ALL Btn
        MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_select_care_basic")).click();
		Thread.sleep(2000);
		System.out.println("select_care_basic");
		MobileObj.navigate().back();
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_select_care_plus")).click();
		Thread.sleep(2000);
		System.out.println("select_care_plus");
		MobileObj.navigate().back();
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_select_care_premium")).click();
		Thread.sleep(2000);
		System.out.println("select_care_premium");
		MobileObj.navigate().back();
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_assurance_basic")).click();
		Thread.sleep(2000);
		System.out.println("assurance_basic");
		MobileObj.navigate().back();
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_assurance_plus")).click();
		Thread.sleep(2000);
		System.out.println("assurance_plus");
		MobileObj.navigate().back();
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_urgent_care_services")).click();
		Thread.sleep(2000);
		System.out.println("urgent_care_services");
		MobileObj.navigate().back();
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_retail_clinic_services")).click();
		Thread.sleep(2000);
		System.out.println("retail_clinic_services");
		MobileObj.navigate().back();
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_preventive_services")).click();
		Thread.sleep(2000);
		System.out.println("preventive_services");
		MobileObj.navigate().back();
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_faqs")).click();
		Thread.sleep(2000);
		System.out.println("faqs");
		MobileObj.navigate().back();
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_limitations_exclusions")).click();
		Thread.sleep(2000);
		System.out.println("limitations_exclusions");
		MobileObj.navigate().back();
       
		MobileObj.navigate().back();
		
		
	}

}
