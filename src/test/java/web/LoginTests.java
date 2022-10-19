package web;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import page.LoginPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTests extends BaseWebTests {
    @Test
    public void loginAndCheck() {
        LoginPage loginPage = open("" ,LoginPage.class);
        loginPage.inputLogin("davidnumberonetest@gmail.com");
        loginPage.clickForwardButton();
        loginPage.inputPassword("passfordavid");
        loginPage.clickForwardButton2();
        //loginPage.clickAccountButton();
        $(By.xpath("//*[@ class = 'gb_A gb_La gb_f']")).shouldHave(Condition.attribute("aria-label", "Google Account: david linch  \n" +
                "(davidnumberonetest@gmail.com)"));
    }
}
