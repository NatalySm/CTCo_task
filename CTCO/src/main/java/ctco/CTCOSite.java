package ctco;

import org.openqa.selenium.By;

class CTCOSite {

    static final By careers = By.xpath(".//*[(@class = 'reload-page') and text() = 'Careers']");
    static final By vacancies = By.xpath(".//*[(@class = 'reload-page') and text() = 'Vacancies']");
    static final By taEngineer = By.xpath(".//*[contains(@class,'menu-link') and text() = 'Test Automation Engineer']");
    static final By responsibilitiesValidation = By.xpath(".//h1[text() = 'Test Automation Engineer']/..//p/strong/em[text() = 'Professional skills and qualification:']/../../../p[.//br]");

}
