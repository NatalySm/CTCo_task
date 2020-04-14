package ctco;

import org.testng.annotations.Test;
import constans.PropertyConfigs;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Assertions;
import utils.WebDriverUtils;

public class VacanciesTest {

    @Test
    public void verifyProfSkills() {

        //Login and go to Test Automation Engineer Vacancy
        WebDriverUtils.driver.get(PropertyConfigs.MAIN_URL);
        WebDriverUtils.driver.manage().window().maximize();
        WebDriverUtils.actions.moveToElement(WebDriverUtils.driver.findElement(CTCOSite.careers)).perform();
        WebDriverUtils.wait.until(ExpectedConditions.presenceOfElementLocated(CTCOSite.vacancies)).isDisplayed();
        WebDriverUtils.driver.findElement(CTCOSite.vacancies).click();
        WebDriverUtils.wait.until(ExpectedConditions.presenceOfElementLocated(CTCOSite.taEngineer)).isDisplayed();
        WebDriverUtils.driver.findElement(CTCOSite.taEngineer).click();

        //Verify that paragraph under Professional skills and qualification: contains exactly 5 skills.
        WebDriverUtils.wait.until(ExpectedConditions.presenceOfElementLocated(CTCOSite.responsibilitiesValidation)).isDisplayed();
        int brCount = WebDriverUtils.driver.findElements(CTCOSite.responsibilitiesValidation).size();
        Assertions.verifyAndQuit("Professional skills and qualification doesn't contains exactly 5 skills.", brCount == 4);
    }
}