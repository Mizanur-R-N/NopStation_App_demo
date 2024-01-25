package testsPackage;

import PagesPackage.*;
import driverPackage.Initialization;
import org.testng.annotations.Test;

public class OrderProduct extends Initialization{

    Home_page objHome;
    ProductList_page objlist;
    productDetails_page objdetails;
    cartpage objcart;
    orderPage objord;



    @Test(priority = 0)
    void AcceptApp() throws InterruptedException {
        objHome = new Home_page(driver);
        objHome.setAcceptbtnClk();
        Thread.sleep(1000);
    }

    @Test(priority = 1)
    void goingToelectronics() throws InterruptedException {
        objHome.setCatagorybtn();
        objHome.setElectronicsclk();
        Thread.sleep(1000);
    }

    @Test(priority = 2)
    void toProductDetails() throws InterruptedException {
        objlist = new ProductList_page(driver);
        objlist.setMattress_Bedroomclk();
        Thread.sleep(1000);
    }
    @Test(priority = 3)
    void IncreaseProduct() throws InterruptedException {
        objdetails = new productDetails_page(driver);
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

    @Test(priority = 6)
    void ConfirmOrderProduct(){
        objord = new orderPage(driver);
        objord.setFirstName();
        objord.setLastName();
        objord.setCity();
        objord.setEmail();
        objord.setCountrydrp();
        objord.setBANCountry();
        objord.setStatedrp();
        objord.setdhkState();
        objord.setCompany();
        objord.setZip();
        objord.setStreet();
        objord.setContinuebtn();
        objord.setNextbtn();
        objord.setContinuebtn();
        objord.setPayment();
        objord.setContinuebtn();
        objord.setNextbtn();
        objord.setconfirmbtn();
        String actual = objord.verifymsg();
        objord.setContinuepop();
        String expected = "Your order has been successfully processed!";
        if (actual.contentEquals(expected)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
    }


}