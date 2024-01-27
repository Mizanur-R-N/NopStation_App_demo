package dataProvidingPackage;

import org.testng.annotations.DataProvider;

public class DataProvidorOrder{
    @DataProvider(name = "guestOrderCredentails")
    public static Object[][] DataSet() {
        return new Object[][]{
                {"50000","12.0","9","2.2"}
        };
    }
}
