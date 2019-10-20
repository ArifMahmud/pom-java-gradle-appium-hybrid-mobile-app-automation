package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import util.Path;
import util.Util;

import java.io.IOException;

public class HomePage extends BasePage {

    public HomePage() throws IOException, InterruptedException {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(xpath = Path.xPathForLanguageChange)
    private WebElement language;

    @FindBy(xpath = Path.xPathForLoginWallet)
    private WebElement walletNumber;

    @FindBy(xpath = Path.xPathForLoginPIN)
    private WebElement logInPin;

    @FindBy(xpath = Path.xPathForLoginButton)
    private WebElement logInButton;

    public boolean validateLoginPageUiELementsVisibility() throws InterruptedException, IOException {

        boolean languageBtnVisible = language.isDisplayed();
        boolean walletNumberInputFieldVisible = walletNumber.isDisplayed();
        boolean pinInputFieldVisible = logInPin.isDisplayed();
        boolean logInBtnVIsible = logInButton.isDisplayed();

        if (languageBtnVisible && logInBtnVIsible && walletNumberInputFieldVisible && pinInputFieldVisible) {
            return true;
        } else
            return false;
    }

    @Test(priority = 1)
    public HomePage testLoginWallet() throws InterruptedException, IOException {
        walletNumber.sendKeys(Util.readConfigData()[2]);
        logInPin.sendKeys(Util.readConfigData()[3]);
        logInButton.click();
        return new HomePage();
    }
}
