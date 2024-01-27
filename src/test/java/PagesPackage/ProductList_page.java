package PagesPackage;


import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;



public class ProductList_page {
    AppiumDriver driver;

    By Mattress_Bedroom = By.xpath("(//android.widget.FrameLayout[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/itemView\"])[4]");
    public ProductList_page(AppiumDriver driver){
        this.driver = driver;
    }


    public void setMattress_Bedroomclk(){
        driver.findElement(Mattress_Bedroom).click();
    }


}
