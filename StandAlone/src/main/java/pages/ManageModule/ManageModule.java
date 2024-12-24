package pages.ManageModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class ManageModule extends BasePage {
    public ManageModule(WebDriver driver) {
        super(driver);
    }

    private final By Manage = By.xpath("//*[text()='Управления']");

    public void GoToManage() {
        WebElement ManageModule1 = driver.findElement(Manage);
        waitElementIsVisible(ManageModule1).click();
    }
}