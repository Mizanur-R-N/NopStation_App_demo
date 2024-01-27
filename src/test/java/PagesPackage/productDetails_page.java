package PagesPackage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class productDetails_page {
    AppiumDriver driver;

    By addquantity = By.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/btnPlus\"]");
    By addtocart = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnAddToCart");

    public productDetails_page(AppiumDriver driver){
        this.driver = driver;
    }
    public void setAddquantity(){
        driver.findElement(addquantity).click();
    }
    public void setAddtocart(){
        driver.findElement(addtocart).click();
    }



}
