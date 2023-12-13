package amazon_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchProduct(String product) {
        WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));
        searchInput.sendKeys(product);
        searchInput.submit();
    }


}
