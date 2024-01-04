package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy (name = "username")
    private WebElement usernameTxt;

    @FindBy (name = "password")
    private WebElement passwordTxt;

    @FindBy (className = "button.orangehrm-login-button")
    private WebElement loginBtn;

    public void login(String user, String password){

    }
}
