package testsPackage;

import PagesPackage.*;
import com.google.common.collect.ImmutableMap;
import driverPackage.Initialization;
//import utilityPackage.commonMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ProductCart extends Initialization{

    Home_page objHome;
    ProductList_page objlist;
    productDetails_page objdetails;



    @Test(priority = 0)
    void AcceptApp() throws InterruptedException {
        Thread.sleep(5000);
        objHome = new Home_page(driver);
        objHome.setAcceptbtnClk();
    }

    @Test(priority = 1)
    void goingToelectronics(){
        objHome.setCatagorybtn();
        objHome.setElectronicsclk();

    }

    @Test(priority = 2)
    void toProductDetails() throws InterruptedException {
       objlist = new ProductList_page(driver);
        boolean ScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
                ImmutableMap.of("left", 100, "top", 100, "width", 100, "height", 200,
                        "direction", "down",
                        "percent", 6.0
                ));
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
        Thread.sleep(5000);
        objHome.setHomeIcon();
        Thread.sleep(5000);
    }

}
