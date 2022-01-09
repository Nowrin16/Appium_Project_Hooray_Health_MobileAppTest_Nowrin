package HoorayHealthNativeApp;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;


public class Member_Support_Page {

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
	
		//Home to Member Support
		WebElement MemberSupport = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/textViewMemberSupport"));
		MemberSupport.click();
        System.out.println("Home to Member Support");
        Thread.sleep(1000);
        
       //***Action Target1*** 
        //Call Member Support
        MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_call")).click();
		Thread.sleep(3000);
		System.out.println("Call Member Support");
		MobileObj.navigate().back();
		MobileObj.navigate().back();
		
        //***Action Target2*** 
        //Email Member Support
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_email_member_support")).click();
	    Thread.sleep(3000);
	    System.out.println("Email Member Support");
		MobileObj.navigate().back();
		
        //***Action Target3*** 
        //Contact form 
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_contact_form")).click();
	    Thread.sleep(3000);
	    System.out.println("Open Contact form");
	    Thread.sleep(3000);
	    //**form fill up**
	    //Name
	    WebElement NameTxt = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/editTextName"));
	    NameTxt.click();
	    MobileObj.navigate().back();
	    //Thread.sleep(3000);
	    NameTxt.sendKeys("Nowrin");
	    Thread.sleep(3000);
	    //Member id
	    WebElement IdTxt = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/editTextMemberID"));
	    IdTxt.click();
	    MobileObj.navigate().back();
	    IdTxt.sendKeys("145");
	    Thread.sleep(3000);
	    //Contact reason
	    WebElement ContactReasonTxt = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/editTextContactReason"));
	    ContactReasonTxt.click();
	    MobileObj.navigate().back();
	    ContactReasonTxt.sendKeys("Fever");
	    Thread.sleep(3000);
	    //Email
	    WebElement EmailTxt = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/editTextEmail"));
	    EmailTxt.click();
	    MobileObj.navigate().back();
	    EmailTxt.sendKeys("ucx42748@boofx.com");
	    Thread.sleep(3000);
	    //phone number
	    MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/editTextPhone")).sendKeys("01234567897");
	    Thread.sleep(3000);
	    //Message 
	    MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/editTextMessage")).sendKeys("High Fever for 1 week");
	    Thread.sleep(3000);
	    
	    //Submit
	    MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btnSubmit")).click();
	    Thread.sleep(3000);
	    	
	    //Clear
	    MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btnClearForm")).click();
	    Thread.sleep(3000);
	    
	    MobileObj.navigate().back(); 
	    MobileObj.navigate().back(); 
		
	}

}
