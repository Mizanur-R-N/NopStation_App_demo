package driverPackage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class Initialization {
    public AppiumDriver driver;

    @BeforeTest
    public void Devicesetup() throws MalformedURLException {
//setup dependency
            UiAutomator2Options opt = new UiAutomator2Options();
            opt.setDeviceName("Nexus 5X API 24");
            opt.setApp(System.getProperty("user.dir")+"\\src\\test\\resources\\apps\\nopstationCart_4.40 1.apk");

            URL url = new URL("http://127.0.0.1:4723");

            driver = new AppiumDriver(url, opt);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }



    @AfterTest
    public void quitDriver() {
        driver.quit();
        System.out.println("Device is close");
    }

}
