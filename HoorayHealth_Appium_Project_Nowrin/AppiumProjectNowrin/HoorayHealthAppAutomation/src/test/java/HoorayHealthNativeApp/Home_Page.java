package HoorayHealthNativeApp;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Home_Page {

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
				
		//Server setup
		URL server = new URL("http://127.0.0.1:4723/wd/hub"); 
		
		//AppiumDriver object creation & send DesiredCapabilities information & server details
		AppiumDriver MobileObj = new AppiumDriver(server,dc);
		
		System.out.println("**********Hooray Health App opening**********");
		
		//delay for 5 second
		Thread.sleep(5000);
		
		//Object create and Action
        //Location Permission
		WebElement allowBtn1 = MobileObj.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
		allowBtn1.click();	
		
		//Take me to Hooray Health Btn
		WebElement takeMeToHHBtn = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_take_me_to_hooray_health"));
		takeMeToHHBtn.click();		
		
		//Media Permission
		WebElement allowBtn2 = MobileObj.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
		allowBtn2.click();
		
		//Home to Provider Lookup
		WebElement ProviderLookup = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/textViewProviderLookup"));
		ProviderLookup.click();
        System.out.println("Home to Provider Lookup");
		Thread.sleep(2000);
		MobileObj.navigate().back();
		
		//Home to Medical Concierge
		WebElement MedicalConcierge = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/textViewMedicalConcierge"));
		MedicalConcierge.click();
		System.out.println("Home to Medical Concierge");
		Thread.sleep(2000);
		MobileObj.navigate().back();
		
		//Home to Prescription Discount
		WebElement PrescriptionDiscount = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/textViewPrescriptionDiscount"));
		PrescriptionDiscount.click();
		System.out.println("Home to Prescription Discount");
		Thread.sleep(2000);
		MobileObj.navigate().back();
		
		//Home to Telemedicine Services
		WebElement TelemedicineServices = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/textViewTelemedicineService"));
		TelemedicineServices.click();
		System.out.println("Home to Telemedicine Services");
		Thread.sleep(2000);
		MobileObj.navigate().back();
		
		//Home to Member Support
		WebElement MemberSupport = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/textViewMemberSupport"));
		MemberSupport.click();
		System.out.println("Home to Member Support");
		Thread.sleep(2000);
		MobileObj.navigate().back();
		
		//Home to Hooray Health Plan Details
		WebElement HHPlanDetails = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/textViewPlanDetails"));
		HHPlanDetails.click();
		System.out.println("Home to Hooray Health Plan Details");
		Thread.sleep(2000);
		MobileObj.navigate().back();
		
		//Burger Menu button
		WebElement BurgerMenuBtn = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/img_burger_menu"));
		BurgerMenuBtn.click();
		System.out.println("**********Home to Burger Menu Btn**********");
		
		//Burger Menu button -> Prescription Discount Card Btn
		WebElement PrescriptionDiscountCardBtn = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_prescription_discount_card"));
		PrescriptionDiscountCardBtn.click();
		System.out.println("Prescription Discount Card Btn");
		Thread.sleep(2000);
		MobileObj.navigate().back();
		
		//Burger Menu button -> Saved Rx Coupons Btn
		BurgerMenuBtn.click();
		WebElement SavedRxCouponsBtn = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_saved_rx_coupons"));
		SavedRxCouponsBtn.click();
		System.out.println("Saved Rx Coupons Btn");
		Thread.sleep(2000);
		MobileObj.navigate().back();
		
		//Burger Menu button -> Favorited Providers Btn
		BurgerMenuBtn.click();
		WebElement FavoritedProvidersBtn = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_favorited_providers"));
		FavoritedProvidersBtn.click();
		System.out.println("Favorited Providers Btn");
		Thread.sleep(2000);
		MobileObj.navigate().back();
		
		//Burger Menu button -> Hooray Health Overview Btn
		BurgerMenuBtn.click();
		WebElement HoorayHealthOverviewBtn = MobileObj.findElement(By.id("com.hoorayhealthcare.asif.hoorayhealth:id/btn_hooray_health_overview"));
		HoorayHealthOverviewBtn.click();
		System.out.println("Hooray Health Overview Btn");
		Thread.sleep(2000);
		MobileObj.navigate().back();
		
	}

}
