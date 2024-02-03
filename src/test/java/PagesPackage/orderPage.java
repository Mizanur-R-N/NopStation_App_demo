package PagesPackage;


import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class orderPage {
    AppiumDriver driver;
    By firstName = By.id("com.nopstation.nopcommerce.nopstationcart:id/etFirstName");
    By lastName = By.id("com.nopstation.nopcommerce.nopstationcart:id/etLastName");
    By email = By.id("com.nopstation.nopcommerce.nopstationcart:id/etEmail");
    By countrydrp = By.id("android:id/text1");
    By Bangladesh = By.xpath("//android.widget.TextView[@text='Bangladesh']");
    By statedrp = By.xpath("//android.widget.Spinner[@resource-id=\"com.nopstation.nopcommerce.nopstationcart:id/stateSpinner\"]");
    By Dhaka = By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"ঢাকা\"]");
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

    public void setFirstName(String ftname){
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(ftname);
    }
    public void setLastName(String ltname){
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(ltname);
    }
    public void setEmail(String cus_email){
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(cus_email);
    }
    public void setCountrydrp(){
        driver.findElement(countrydrp).click();
    }
    public void setBANCountry() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bangladesh\"));"));
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//android.widget.TextView[@text='Bangladesh']")).click();
        driver.findElement(Bangladesh).click();
    }
    public void setStatedrp(){
        driver.findElement(statedrp).click();
    }
    public void setdhkState(){
        driver.findElement(Dhaka).click();
    }
    public void setCompany(String com){
        driver.findElement(company).clear();
        driver.findElement(company).sendKeys(com);
    }
    public void setCity(String cus_city){
        driver.findElement(city).clear();
        driver.findElement(city).sendKeys(cus_city);
    }
    public void setStreet(String cus_street){
        driver.findElement(street).clear();
        driver.findElement(street).sendKeys(cus_street);
    }
    public void setZip(String ct_zip){
        driver.findElement(zip).clear();
        driver.findElement(zip).sendKeys(ct_zip);
    }
    public void setContinuebtn(){
        driver.findElement(continuebtn).click();
    }

    public void setAddress(String ftname, String ltname, String cus_email, String comp, String cus_city, String cus_street, String ct_zip) throws InterruptedException {
        this.setCountrydrp();
        this.setBANCountry();
        this.setStatedrp();
        this.setdhkState();
        this.setFirstName(ftname);
        this.setLastName(ltname);
        this.setEmail(cus_email);
        this.setCompany(comp);
        boolean ScrollingMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 100, "height", 200,
                "direction", "down",
                "percent", 6.0
        ));
        this.setCity(cus_city);
        this.setZip(ct_zip);
        this.setStreet(cus_street);
        this.setContinuebtn();
    }

    public void setNxtday(){
        driver.findElement(nxtday).click();
    }
    public void setShippingType(){
        this.setNxtday();
        boolean ScrollingMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 100, "height", 200,
                "direction", "down",
                "percent", 6.0
        ));
        this.setContinuebtn();
    }



    public void setPayment(){
        driver.findElement(payment).click();
    }

    public void setPaymentType(){
        boolean canScrollMore;
        do {
            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 200, "height", 200,
                    "direction", "down",
                    "percent", 3.0
            ));

        } while(canScrollMore);

        this.setPayment();
        this.setContinuebtn();
    }

    public void setNextbtn(){
        driver.findElement(nextbtn).click();
    }

    public void setconfirmbtn(){
        driver.findElement(confirm).click();
    }

    public void setOrderConfirm() throws InterruptedException {
        this.setNextbtn();
        Thread.sleep(5000);
        this.setconfirmbtn();
    }

//    public String verifymsg(){
//        String msg = driver.findElement(confirmMSG).getText();
//        return msg;
//    }
//    public void setContinuepop(){
//        String msg = driver.findElement(confirmMSG).getText();
//        driver.findElement(continuepop).click();
//    }
//String expected = "Your order has been successfully processed!";
//        if (actual.contentEquals(expected)){
//        System.out.println("Test Passed!");
//    } else {
//        System.out.println("Test Failed");
//    }


}
