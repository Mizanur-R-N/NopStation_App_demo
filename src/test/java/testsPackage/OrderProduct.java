package testsPackage;

import PagesPackage.*;
import com.google.common.collect.ImmutableMap;
import dataProvidingPackage.DataProvidorOrder;
import driverPackage.Initialization;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class OrderProduct extends Initialization{

    Home_page objHome;
    ProductList_page objlist;
    productDetails_page objdetails;
    cartpage objcart;
    orderPage objord;



    @Test(priority = 0)
    void AcceptApp() throws InterruptedException {
        Thread.sleep(5000);
        objHome = new Home_page(driver);
        objHome.setAcceptbtnClk();
    }

    @Test(priority = 1)
    void goingToelectronics() throws InterruptedException {
        objHome.setCatagorybtn();
        objHome.setElectronicsclk();
        Thread.sleep(10000);
    }

    @Test(priority = 2)
    void toProductDetails() throws InterruptedException {
        objlist = new ProductList_page(driver);
        boolean ScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
                ImmutableMap.of("left", 100, "top", 100, "width", 100, "height", 200,
                        "direction", "down",
                        "percent", 7.0));
        objlist.setMattress_Bedroomclk();
        Thread.sleep(10000);
    }
    @Test(priority = 3)
    void IncreaseProduct() throws InterruptedException {
        objdetails = new productDetails_page(driver);
        boolean ScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 100, "height", 200,
                "direction", "down",
                "percent", 6.0
        ));
        objdetails.setAddquantity();
        Thread.sleep(1000);
    }
    @Test(priority = 4)
    void AddingProductToCart() throws InterruptedException {
        objdetails.setAddtocart();
        Thread.sleep(1000);
        objHome.setCartIcon();
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    void ProductCheckout() throws InterruptedException {
        objcart = new cartpage(driver);
        objcart.setCheckoutbtnClk();
        Thread.sleep(2000);
        objcart.setGuestclk();
        Thread.sleep(2000);
    }

    @Test(priority = 6, dataProvider = "guestOrderCredentails", dataProviderClass = DataProvidorOrder.class)
    void ProductOrderAddress(String ftname, String ltname, String cus_email, String comp, String cus_city, String cus_street, String ct_zip) throws InterruptedException {
        objord = new orderPage(driver);
        objord.setAddress(ftname, ltname, cus_email, comp, cus_city, cus_street, ct_zip);
    }
    @Test(priority = 7)
    void ProductOrderShipping() throws InterruptedException {
        objord.setShippingType();
        Thread.sleep(2000);
    }
    @Test(priority = 8)
    void ProductOrderPayment() throws InterruptedException {
        objord.setPaymentType();
        Thread.sleep(10000);
    }

    @Test(priority = 9)
    void OrderConfirmInfo() throws InterruptedException {
        objord.setOrderConfirm();
    }

    //        String actual = objord.verifymsg();
//        objord.setContinuepop();
//        String expected = "Your order has been successfully processed!";
//        if (actual.contentEquals(expected)){
//            System.out.println("Test Passed!");
//        } else {
//            System.out.println("Test Failed");
//        }


}