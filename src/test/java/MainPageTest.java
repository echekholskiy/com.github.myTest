import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainPageTest {
   private WebDriver driver;
   private MainPage mainPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\nazhivka.by\\IdeaProjects\\testselenium\\drivers\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com/");
        mainPage=new MainPage(driver);
    }

    @Test
    public void SignIn(){
        SignInPage SIP=mainPage.clickSignIn();
        String Valerka=SIP.getH1();
        Assert.assertEquals("Sign in to GitHub", Valerka);
    }

    @After
    public void quit(){
        driver.quit();
    }



}
