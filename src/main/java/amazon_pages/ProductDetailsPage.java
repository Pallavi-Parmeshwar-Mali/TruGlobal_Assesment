package amazon_pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    

public class ProductDetailsPage extends BasePage{
	public ProductDetailsPage(WebDriver driver) {
        super(driver);
  
   }

   public String getProductPrice() {
       WebElement priceElement = driver.findElement(By.id("priceblock_ourprice"));
       return priceElement.getText();
   }

   public void addToCart() {
       WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
       addToCartButton.click();
   }
}
