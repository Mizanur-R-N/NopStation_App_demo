package PagesPackage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class orderPage {
    AppiumDriver driver;
    By firstName = By.id("com.nopstation.nopcommerce.nopstationcart:id/etFirstName");
    By lastName = By.id("com.nopstation.nopcommerce.nopstationcart:id/etLastName");
    By email = By.id("com.nopstation.nopcommerce.nopstationcart:id/etEmail");
    By countrydrp = By.id("com.nopstation.nopcommerce.nopstationcart:id/countrySpinnerLayout");
    By ban = By.xpath("(//android.widget.TextView[@resource-id=\"android:id/text1\"])[4]");
    By statedrp = By.id("com.nopstation.nopcommerce.nopstationcart:id/stateSpinner");
    By dhk = By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"ঢাকা\"]\n");
    By company = By.id("com.nopstation.nopcommerce.nopstationcart:id/etCompanyName");
    By city = By.id("com.nopstation.nopcommerce.nopstationcart:id/etCity");
    By street = By.id("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress");
    By zip = By.id("com.nopstation.nopcommerce.nopstationcart:id/etZipCode");
    By continuebtn = By.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue");
    By nxtday = By.xpath("//com.bs.ecommerce.customViews.RadioGridGroupforReyMaterial[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/radioGridGroup\"]/android.widget.RelativeLayout[4]\n");
    By payment = By.xpath("//com.bs.ecommerce.customViews.RadioGridGroupforReyMaterial[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/radioGridGroup\"]/android.widget.RelativeLayout[2]\n");
    By nextbtn = By.xpath("//android.widget.Button[@content-desc=\"Next\"]");
    By confirm = By.xpath("//android.widget.Button[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/checkoutButton\"]");
    By confirmPop = By.xpath("//android.widget.FrameLayout[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/md_root\"]\n");
    By confirmMSG = By.id("com.nopstation.nopcommerce.nopstationcart:id/md_text_message\n");
    By continuepop = By.id("com.nopstation.nopcommerce.nopstationcart:id/md_button_positive");
    public orderPage(AppiumDriver driver){
        this.driver = driver;
    }

    public void setFirstName(){
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys("Mizanur");
    }
    public void setLastName(){
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys("Rahaman");
    }
    public void setEmail(){
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys("mr@mail.com");
    }
    public void setCountrydrp(){
        driver.findElement(countrydrp).click();
    }
    public void setBANCountry(){
        driver.findElement(ban).click();
    }
    public void setStatedrp(){
        driver.findElement(statedrp).click();
    }
    public void setdhkState(){
        driver.findElement(dhk).click();
    }
    public void setCompany(){
        driver.findElement(company).clear();
        driver.findElement(company).sendKeys("xyz ltd");
    }
    public void setCity(){
        driver.findElement(city).clear();
        driver.findElement(city).sendKeys("Dhaka");
    }
    public void setStreet(){
        driver.findElement(street).clear();
        driver.findElement(street).sendKeys("mirpur");
    }
    public void setZip(){
        driver.findElement(zip).clear();
        driver.findElement(zip).sendKeys("1216");
    }
    public void setContinuebtn(){
        driver.findElement(continuebtn).click();
    }
    public void setNxtday(){
        driver.findElement(nxtday).click();
    }
    public void setPayment(){
        driver.findElement(payment).click();
    }
    public void setNextbtn(){
        driver.findElement(nextbtn).click();
    }
    public void setconfirmbtn(){
        driver.findElement(confirm).click();
    }
    public String verifymsg(){
        String msg = driver.findElement(confirmMSG).getText();
        return msg;
    }
    public void setContinuepop(){
        String msg = driver.findElement(confirmMSG).getText();
        driver.findElement(continuepop).click();
    }


}
