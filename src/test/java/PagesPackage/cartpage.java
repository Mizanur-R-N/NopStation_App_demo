package PagesPackage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class cartpage {
    AppiumDriver driver;
    By checkout = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut");
//    By userPopup = By.xpath("//android.widget.ScrollView/android.widget.LinearLayout");
    By guest = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout");

    public cartpage(AppiumDriver driver){
        this.driver = driver;
    }
    public void setCheckoutbtnClk(){
        driver.findElement(checkout).click();
    }
    public void setGuestclk(){
        driver.findElement(guest).click();
    }


}
