package PagesPackage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_page {
    AppiumDriver driver;
    By acceptbtn = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnAccept");
    By catagoryIcon = By.xpath("//android.widget.TextView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/navigation_bar_item_small_label_view\" and @text=\"Category\"]");
    By electronics = By.xpath("//android.widget.TextView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/tvName\" and @text=\"Electronics\"]");
    By cartIcon = By.id("com.nopstation.nopcommerce.nopstationcart:id/counterIcon");
    By homeIcon = By.xpath("(//android.widget.ImageView[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/navigation_bar_item_icon_view\"])[1]");

    public Home_page(AppiumDriver driver){
        this.driver = driver;
    }
    public void setAcceptbtnClk(){
        driver.findElement(acceptbtn).click();
    }

    public void setCatagorybtn(){
        driver.findElement(catagoryIcon).click();
    }

    public void setElectronicsclk(){
        driver.findElement(electronics).click();
    }

    public void setHomeIcon(){
        driver.findElement(homeIcon).click();
    }
    public void setCartIcon(){
        driver.findElement(cartIcon).click();
    }



}
