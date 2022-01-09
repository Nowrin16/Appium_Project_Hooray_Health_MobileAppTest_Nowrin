package HoorayHealthNativeApp;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;


public class Prescription_Discount_Page {

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
	
		//Home to Prescription Discount
		WebElement PrescriptionDiscount = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/textViewPrescriptionDiscount"));
		PrescriptionDiscount.click();
        System.out.println("Home to Prescription Discount");
        Thread.sleep(1000);
        
        //***Action Target1*** 
        //SEARCH FOR Prescription 
        MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/autocomplete_search_for_a_prescription")).sendKeys("A ");
        Thread.sleep(3000);
        MobileObj.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView")).click();
		Thread.sleep(5000);
		System.out.println("Search done");
		//Drug name
		MobileObj.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
		Thread.sleep(3000);
		MobileObj.findElement(By.id("android:id/button1")).click();
		Thread.sleep(3000);
		//Drug from
		MobileObj.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.ImageView")).click();
		Thread.sleep(3000);
		MobileObj.findElement(By.id("android:id/button1")).click();
		Thread.sleep(3000);
		//Quantity
		MobileObj.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.ImageView")).click();
		Thread.sleep(3000);
		//Custom value
		Thread.sleep(3000);
		MobileObj.findElement(By.id("android:id/button1")).click();
		//text
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/input")).sendKeys("5");
		Thread.sleep(3000);
		MobileObj.findElement(By.id("android:id/button1")).click();
		Thread.sleep(3000);
		
		//SearchBtn
		MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_search")).click();
		//did'nt work
		
		
	}

}
