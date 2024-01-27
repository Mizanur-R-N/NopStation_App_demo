package driverPackage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class Initialization {
    public AppiumDriver driver;
    public AppiumDriverLocalService service;

    @BeforeTest
    public void Devicesetup() throws MalformedURLException {

        service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\pc\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();

        service.start();

        //setup dependency
        UiAutomator2Options opt = new UiAutomator2Options();
        opt.setDeviceName("Nexus 5X API 24");
        opt.setApp(System.getProperty("user.dir")+"\\src\\test\\resources\\apps\\nopstationCart_4.40 1.apk");


        driver = new AppiumDriver(new URL("http://127.0.0.1:4723"), opt);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }



    @AfterTest
    public void quitDriver() {
        driver.quit();
        service.stop();
    }

}
