import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    By SignUp=By.xpath("//div[@class='position-relative']/parent::*/parent::*/following-sibling::*[2]");
    By SignIn=By.xpath("//div[@class='position-relative']/parent::*/parent::*/following-sibling::*[1]");
    By SearchInput=By.xpath("//form[@class='js-site-search-form']//input[1]");

    public SignUpPage clickSignUp(){
        driver.findElement(SignUp).click();
        return new SignUpPage(driver);
    }

    public SignInPage clickSignIn(){
        driver.findElement(SignIn).click();
        return new SignInPage(driver);
    }

    public SearchPage UseSearch(String text){
        driver.findElement(SearchInput).sendKeys(text);
        driver.findElement(SearchInput).sendKeys(Keys.ENTER);
        return new SearchPage(driver);
    }




}
