package HoorayHealthNativeApp;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;


public class Provider_Lookup_Page {

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
	
		//Home to Provider Lookup
		WebElement ProviderLookup = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/textViewProviderLookup"));
		ProviderLookup.click();
        System.out.println("Home to Provider Lookup");
        Thread.sleep(1000);
        
        //***Action Target1*** 
        //Selected-> (Hooray Health Network & All locations), Click Search, back, Click Clear Filter
        //search
        WebElement SearchBtn = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_search"));    
        SearchBtn.click();
		Thread.sleep(5000);
		System.out.println("Search 1");
		MobileObj.navigate().back();
        //clear
		WebElement ClearBtn = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_clear_filters"));    
		ClearBtn.click();
		//Selected-> (Hooray Health Network & Other options), Click Search, back, Click Clear Filter
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/checkbox_walk_in_welcome")).click();
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/checkbox_onsite_labs")).click();
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/checkbox_onsite_xrays")).click();
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/checkbox_urgent_cares_only")).click();
		//search
        SearchBtn.click();
		Thread.sleep(5000);
		System.out.println("Search 1");
		MobileObj.navigate().back();
        //clear
		ClearBtn.click();
		
		//***Action Target2*** 
        //Selected-> (Fast Health Network), Click Search, back, Click Clear Filter
		//swipeBtnFHN
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/switch_first_health_network")).click();
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_search_first_health_network")).click();
		//search
        SearchBtn.click();
		Thread.sleep(5000);
		System.out.println("Search 2");
		MobileObj.navigate().back();
        //clear
		ClearBtn.click();
		
		//***Action Target3*** 
        //Selected-> (One call radiology), Click Search, back, Click Clear Filter
		//swipeBtnOCR
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/switch_one_call_radiology_network")).click();
		//select options
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/checkBoxPET")).click();
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/checkBoxCT")).click();
		//search
        SearchBtn.click();
		Thread.sleep(5000);
		System.out.println("Search 3");
		MobileObj.navigate().back();
        //clear
		ClearBtn.click();
		
		//Find My location
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/lbl_find_my_location")).click();
		
		
		MobileObj.navigate().back();
		
		
	}

}
