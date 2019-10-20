package testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LogInPage;

import java.io.IOException;

public class TestLogInPage {

    LogInPage logInPage;

    @BeforeTest
    public void init() throws IOException, InterruptedException {
        logInPage = new LogInPage();
    }

    @Test(priority = 0)
    public void testUiElementVisibility() throws IOException, InterruptedException {
        Assert.assertEquals(true, logInPage.validateLoginPageUiELementsVisibility());
    }

    @Test(priority = 1)
    public void testLogIn() throws IOException, InterruptedException {
        Assert.assertEquals(logInPage, logInPage.testLoginWallet());
    }
}
