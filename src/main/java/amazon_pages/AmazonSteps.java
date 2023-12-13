package amazon_pages;

import amazon_pages.HomePage;
import amazon_pages.ProductDetailsPage;
import amazon_pages.RegistrationPage;
import amazonutils.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AmazonSteps {
	private WebDriver driver = DriverManager.getDriver();
    private HomePage homePage = new HomePage(driver);
    private ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
    private RegistrationPage registrationPage = new RegistrationPage(driver);

    @Given("I am on the Amazon home page")
    public void iAmOnTheAmazonHomePage() {
        // Navigate to Amazon
        driver.get("https://www.amazon.in/");
    }

    @When("I search for {string}")
    public void iSearchForProduct(String product) {
        homePage.searchProduct(product);
    }

    @When("I select the first product from the list")
    public void iSelectTheFirstProductFromTheList() {
        // Implement the logic to select the first product
    }

    @When("I go to the product details page")
    public void iGoToTheProductDetailsPage() {
        // Implement the logic to go to the product details page
    }

    @When("I store the price in a variable")
    public void iStoreThePriceInAVariable() {
        String price = productDetailsPage.getProductPrice();
        // Store the price variable (you can use a context or a class variable)
    }

    @When("I add the product to the cart")
    public void iAddTheProductToTheCart() {
        productDetailsPage.addToCart();
    }

    @Then("I should be able to register a new user with the following details:")
    public void iShouldBeAbleToRegisterANewUserWithTheFollowingDetails(io.cucumber.datatable.DataTable dataTable) {
        // Implement the logic to read user details from DataTable and register a new user
    }

    @When("I search for phones and apply filters")
    public void iSearchForPhonesAndApplyFilters() {
        // Implement the logic to search for phones and apply filters
    }

    @Then("I should see a validated filtered list of phones")
    public void iShouldSeeAValidatedFilteredListOfPhones() {
        // Implement the logic to validate the filtered list
    }
}
