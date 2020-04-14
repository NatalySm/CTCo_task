package utils;

import constans.PropertyConfigs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {

    private static final String chromePath = System.setProperty(PropertyConfigs.SELENIUM_DRIVER, PropertyConfigs.SELENIUM_DRIVER_PATH);

    public static final int timeout = Integer.parseInt(PropertyConfigs.APP_WAIT);
    public static final WebDriver driver = new ChromeDriver();
    public static WebDriverWait wait = new WebDriverWait(driver, timeout);
    public static Actions actions = new Actions(WebDriverUtils.driver);
}
