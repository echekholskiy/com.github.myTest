import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    By usernamefield=By.xpath("//input[@id='login_field']");
    By passwordfield=By.xpath("//input[@id='password']");
    By SignInButton=By.xpath("//input[@name='commit']");
    By createAnAccount=By.xpath("//a[(text()='Create an account')]");
    By h1=By.xpath("//h1");
    By errorText=By.xpath("//div[@class='container-lg px-2']");

    public SignInPage typeUser(String username){
        driver.findElement(usernamefield).sendKeys(username);
        return this;
    }

    public SignInPage typePassword(String password){
        driver.findElement(passwordfield).sendKeys(password);
        return this;
    }

    public SignInPage clickButtonSI(){
        driver.findElement(SignInButton).click();
        return this;
    }

    public SignInPage incorrectSignIn(String username, String password){
        this.typeUser(username);
        this.typePassword(password);
        this.clickButtonSI();
        return new SignInPage(driver);
    }

    public SignUpPage ClickCreateAccount(){
        driver.findElement(createAnAccount).click();
        return new SignUpPage(driver);
    }

    public String getH1(){
        return driver.findElement(h1).getText();
    }

    public String getErrorText(){
        return driver.findElement(errorText).getText();
    }



}
