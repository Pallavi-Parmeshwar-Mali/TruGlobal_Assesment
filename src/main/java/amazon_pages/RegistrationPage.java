package amazon_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class RegistrationPage extends BasePage{
	 public RegistrationPage(WebDriver driver) {
	        super(driver);
	    }

	    public void registerUser(String name, String email, String password) {
	        WebElement nameInput = driver.findElement(By.id("ap_customer_name"));
	        nameInput.sendKeys(name);

	        WebElement emailInput = driver.findElement(By.id("ap_email"));
	        emailInput.sendKeys(email);

	        WebElement passwordInput = driver.findElement(By.id("ap_password"));
	        passwordInput.sendKeys(password);

	        WebElement createAccountButton = driver.findElement(By.id("continue"));
	        createAccountButton.click();
	    }

}
