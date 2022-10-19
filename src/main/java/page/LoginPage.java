package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how = How.XPATH, using = "//*[@name = 'identifier']")
    private SelenideElement loginField;

    @FindBy(how = How.ID, using = "identifierNext")
    private SelenideElement forwardButton;

    @FindBy(how = How.XPATH, using = "//*[@name = 'Passwd']")
    private SelenideElement passwordField;

    @FindBy(how = How.ID, using = "passwordNext")
    private SelenideElement forwardButton2;

    @FindBy(how = How.XPATH, using = "//*[@class = 'gb_A gb_La gb_f']")
    private SelenideElement accountButton;


    public void inputLogin(String username) {
        loginField.setValue(username);
    }

    public void inputPassword(String password) {
        passwordField.setValue(password);
    }

    public void clickForwardButton() {forwardButton.click(); }

    public void clickForwardButton2() {forwardButton2.click(); }

    public void clickAccountButton () {accountButton.click(); }




}
