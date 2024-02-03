package dataProvidingPackage;

import org.testng.annotations.DataProvider;

public class DataProvidorOrder{
    @DataProvider(name = "guestOrderCredentails")
    public static Object[][] DataSet() {
        return new Object[][]{
                {"Mizanur", "Rahaman", "mizanur@mail.com", "BS23", "Dhaka", "Mirpur", "1216"}
        };
    }
}
