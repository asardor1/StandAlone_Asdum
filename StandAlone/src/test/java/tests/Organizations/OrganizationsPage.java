package tests.Organizations;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ManageModule.ManageModule;
import tests.base.BaseTest;

import static constants.Constant.URLs.ASDUM_LOGIN_PAGE;
import static constants.Constant.loginData.passwordLogin;
import static constants.Constant.loginData.usernameLogin;

public class OrganizationsPage extends BaseTest {
    @BeforeMethod
    public void openSite() {
        basePage.open(ASDUM_LOGIN_PAGE);
    }
    @Test
    public void logInEntry() {
        loginPage.LoginData(usernameLogin);
        loginPage.password(passwordLogin);
        loginPage.entryBtn();
        boolean logo = driver.findElement(By.className("_logoImg_1v3h4_37")).isDisplayed();
        Assert.assertTrue(logo);
        System.out.println("Test from logInEntry is running!");
    }

    @Test
    public static void gotoManage() {
        ManageModule.GoToManage();
        System.out.println("Test from gotoManageModule is running!");
    }
}