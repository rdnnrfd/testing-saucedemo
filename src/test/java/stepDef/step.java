package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class step {
    WebDriver driver; //set driver
    String baseUrl = "https://www.saucedemo.com/"; //set base url

    @Given("User on Login page")
    public void userOnLoginPage() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(baseUrl);

        String loginPageAssert = driver.findElement(By.className("login_logo")).getText();
        Assert.assertEquals(loginPageAssert, "Swag Labs");
        Thread.sleep(1000);
    }

    @When("User input username and password")
    public void userInputUsernameAndPassword() throws InterruptedException{
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
    }

    @And("Click login button")
    public void clickLoginButton() throws InterruptedException{
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);
    }

    @Then("User on Products page")
    public void userOnProductsPage() throws InterruptedException{
        String getTitle = driver.findElement(By.className("title")).getText();
        Assert.assertEquals(getTitle, "Products");
        Thread.sleep(1000);
//        driver.close();
    }

    @When("Input invalid username and password")
    public void inputInvalidUsernameAndPassword() throws InterruptedException{
        driver.findElement(By.id("user-name")).sendKeys("standarduser");
        driver.findElement(By.id("password")).sendKeys("secretsauce");
        Thread.sleep(1000);
    }

    @Then("Error message should be displayed")
    public void errorMessageShouldBeDisplayed() throws InterruptedException{
        String errorLogin = driver.findElement(By.xpath("//*[@id='login_button_container']/div/form/div[3]/h3")).getText();
        Assert.assertEquals(errorLogin, "Epic sadface: Username and password do not match any user in this service");
        Thread.sleep(1000);
        driver.close();
    }

    @And("Click menu button")
    public void clickMenuButton() throws InterruptedException{
        driver.findElement(By.className("bm-burger-button")).click();
        Thread.sleep(1000);
    }

    @And("Click logout button")
    public void clickLogoutButton() throws InterruptedException{
        driver.findElement(By.id("logout_sidebar_link")).click();
        Thread.sleep(1000);
//        driver.close();
    }

    @When("User click add to cart button")
    public void userClickAddToCartButton() throws InterruptedException{
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(1000);
    }

    @And("User click shopping cart button")
    public void userClickShoppingCartButton() throws InterruptedException{
        driver.findElement(By.id("shopping_cart_container")).click();
        Thread.sleep(1000);
    }

    @Then("User success add product to cart")
    public void userSuccessAddProductToCart() throws InterruptedException{
        String getTitle = driver.findElement(By.className("title")).getText();
        Assert.assertEquals(getTitle, "Your Cart");
        Thread.sleep(1000);
    }

    @And("User click remove button")
    public void userClickRemoveButton() throws InterruptedException{
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
        Thread.sleep(1000);
    }

    @Then("User success remove product from cart")
    public void userSuccessRemoveProductFromCart() throws InterruptedException{
        String getTitle = driver.findElement(By.className("header_secondary_container")).getText();
        Assert.assertEquals(getTitle, "Your Cart");
        Thread.sleep(1000);
    }

    @And("Click checkout button")
    public void clickCheckoutButton() throws InterruptedException{
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(1000);
    }

    @And("Input first name column")
    public void inputFirstNameColumn() throws InterruptedException{
        driver.findElement(By.id("first-name")).sendKeys("Rida");
        Thread.sleep(1000);
    }

    @And("Input last name column")
    public void inputLastNameColumn() throws InterruptedException{
        driver.findElement(By.id("last-name")).sendKeys("Annurfaida");
        Thread.sleep(1000);
    }

    @And("Input postal code")
    public void inputPostalCode() throws InterruptedException{
        driver.findElement(By.id("postal-code")).sendKeys("140111");
        Thread.sleep(1000);
    }

    @And("Click continue button")
    public void clickContinueButton() throws InterruptedException{
        driver.findElement(By.id("continue")).click();
        Thread.sleep(1000);
    }

    @And("Click finish button")
    public void clickFinishButton() throws InterruptedException{
        driver.findElement(By.id("finish")).click();
        Thread.sleep(1000);
    }

    @Then("User success checkout the product")
    public void userSuccessCheckoutTheProduct() throws InterruptedException{
        String getTitle = driver.findElement(By.className("title")).getText();
        Assert.assertEquals(getTitle, "Checkout: Complete!");
        Thread.sleep(1000);
    }

    @Then("an error message appears")
    public void anErrorMessageAppears() throws InterruptedException{
        driver.findElement(By.className("error-button"));
        Thread.sleep(1000);
    }

}
