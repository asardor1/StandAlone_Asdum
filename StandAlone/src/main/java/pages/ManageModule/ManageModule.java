package pages.ManageModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class ManageModule extends BasePage {
    public ManageModule(WebDriver driver) {
        super(driver);
    }

    private static final By Manage = By
            .xpath("/html/body/div[1]/div[1]/div[1]/div/nav/ul/a[4]/li");

    public static void GoToManage() {
        WebElement ManageModule1 = driver.findElement(Manage);
        waitElementIsVisible(ManageModule1)
                .click();
        System.out
                .println("Test from gotoManage is running!");
    }
}