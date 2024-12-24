package pages.asdum_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private final By usernameField = By.name("username");
    private final By passwordField = By.name("password");
    private final By enterBtn = By.className("mantine-Button-label");

    public void LoginData(String username) {
        WebElement UserInput = driver.findElement(usernameField);

        String fieldValue = UserInput.getAttribute("value");
        if (fieldValue == null || fieldValue.isEmpty()) {
            System.out.println("Поле 'Username' пустое");
        } else {
            System.out.println("Поле содержит текст: " + fieldValue);
        }
        waitElementIsVisible(UserInput).sendKeys(username);
    }
    public void password(String password) {
        WebElement PassInput = driver.findElement(passwordField);

        String fieldValue2 = PassInput.getAttribute("value");
        if (fieldValue2 == null || fieldValue2.isEmpty()) {
            System.out.println("Поле 'Password' пустое");
        } else {
            System.out.println("Поле содержит текст: " + fieldValue2);
        }
        waitElementIsVisible(PassInput).sendKeys(password);
    }
    public void entryBtn() {
        driver.findElement(enterBtn).click();
    }
}