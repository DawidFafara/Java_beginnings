import com.gargoylesoftware.htmlunit.javascript.host.WeakMap;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;

public class AutomationPracticeTest {
    private WebDriver driver;

    @Before
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    public  void dummy()
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void logInTest()
    {
        WebElement signInBtn;
        String email = "testmail@test.pl";
        String pswd = "testowehaslo";

        signInBtn = driver.findElement(By.className("login"));

        signInBtn.click();

        WebElement emailTxtFld;
        WebElement pswdTxtFld;
        WebElement submitLoginBtn;
        WebElement myPersonalInfoBtn;
        WebElement myInfoEmailTxtFld;

        emailTxtFld = driver.findElement(By.id("email"));
        emailTxtFld.sendKeys(email);

        pswdTxtFld = driver.findElement(By.id("passwd"));
        pswdTxtFld.sendKeys(pswd);

        submitLoginBtn = driver.findElement(By.id("SubmitLogin"));
        submitLoginBtn.click();

        myPersonalInfoBtn = driver.findElement(By.xpath("//*[@title=\"Information\"]"));
        myPersonalInfoBtn.click();

        myInfoEmailTxtFld = driver.findElement(By.id("email"));

        String emailObserved = myInfoEmailTxtFld.getAttribute("value");
        assertEquals(email, emailObserved);
    }

    @Test
    public void registerUser()
    {
        String email = "test123@tes326.fsg";
        Boolean isMale = true;
        String firstName = "Wiesław";
        String lastName = "Paleta";
        String pswd = "mielone";
        String address = "Grochów";
        String city = "Warszawa";
        String zipcode = "00000";
        String state ;
        String country;
        String phoneNumber = "123456789";


        WebElement signInBtn;
        WebElement emailTxtFld;
        WebElement createAccount;
        WebElement sexRadioBtn;
        WebElement firstNameTxtFld;
        WebElement lastNameTxtFld;
        WebElement pswdTxtFld;
        WebElement addressTxtFld;
        WebElement cityTxtFld;
        WebElement zipCodeTxtFld;
        WebElement phoneNumberTxtFld;
        WebElement registerBtn;

        Select stateDropDown;

        signInBtn = driver.findElement(By.className("login"));
        signInBtn.click();

        emailTxtFld = driver.findElement(By.id("email_create"));
        emailTxtFld.sendKeys(email);

        createAccount = driver.findElement(By.id("SubmitCreate"));
        createAccount.click();

        if(isMale)
            sexRadioBtn = driver.findElement(By.id("id_gender1"));
        else
            sexRadioBtn = driver.findElement(By.id("id_gender2"));
        sexRadioBtn.click();

        firstNameTxtFld = driver.findElement(By.id("customer_firstname"));
        firstNameTxtFld.sendKeys(firstName);

        lastNameTxtFld = driver.findElement(By.id("customer_lastname"));
        lastNameTxtFld.sendKeys(lastName);

        pswdTxtFld = driver.findElement(By.id("passwd"));
        pswdTxtFld.sendKeys(pswd);

        addressTxtFld = driver.findElement(By.id("address1"));
        addressTxtFld.sendKeys(address);

        cityTxtFld = driver.findElement(By.id("city"));
        cityTxtFld.sendKeys(city);

        zipCodeTxtFld = driver.findElement(By.id("postcode"));
        zipCodeTxtFld.sendKeys(zipcode);

        stateDropDown = new Select(driver.findElement(By.id("id_state")));
        stateDropDown.selectByValue("12");

        //alternatywnie:
        /*
        WebElement stateWE = driver.findElement(By.id("id_state"));
        stateWE.click();
        WebElement stateAlabama = driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[@value=\"1\"]"));
        stateAlabama.click();
        */

        phoneNumberTxtFld = driver.findElement(By.id("phone_mobile"));
        phoneNumberTxtFld.sendKeys(phoneNumber);



//        registerBtn = driver.findElement(By.id("submitAccount"));
//        registerBtn.click();


    }
    public void logIn(String email, String pswd){

    }
    @Test
    public void logInSuccess(){
        logIn("testowanie@jest.super", "test223");

    }
    @After
    public void tearDown()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
    }
}