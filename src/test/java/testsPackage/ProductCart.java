package testsPackage;

import PagesPackage.*;
import driverPackage.Initialization;
import org.testng.annotations.Test;

public class ProductCart extends Initialization{

    Home_page objHome;
    ProductList_page objlist;
    productDetails_page objdetails;


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
        objHome.setHomeIcon();
    }

}
