import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SportsDirectTests {
private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
private final By KIDS_CATALOG_BTN = By.xpath(".//div[@title=\"Kids\"]");
private final By KIDS_HOODIES_BTN = By.xpath(".//span[@class='slideName' and text()='Hoodies']");
private final By PRICE_FILTER_MIN = By.id("PriceFilterTextEntryMin");
private final By PRICE_FILTER_MAX = By.id("PriceFilterTextEntryMax");
private final By APPLY_PRICE_FILTER = By.id("PriceFilterTextEntryApply");
private final String PRICE_FROM = "25";
private final String PRICE_TO = "35";
private final By HOODIES_FILTERED_LIST = By.xpath(".//ul[@class = 's-productscontainer2 plp-products-container ']");


    @Test
    public void shoppingCartCheck() {
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://lv.sportsdirect.com/");

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(ACCEPT_COOKIES_BTN));

        WebElement acceptBtn = browser.findElement(ACCEPT_COOKIES_BTN);
        acceptBtn.click();

        WebElement kidsCatalog = browser.findElement(KIDS_CATALOG_BTN);
        kidsCatalog.click();

        WebElement kidsHoodies = browser.findElement(KIDS_HOODIES_BTN);
        kidsHoodies.click();

        WebElement priceFilterMin = browser.findElement(PRICE_FILTER_MIN);
        priceFilterMin.sendKeys(PRICE_FROM);

        WebElement priceFilterMax = browser.findElement(PRICE_FILTER_MAX);
        priceFilterMax.sendKeys(PRICE_TO);

        WebElement applyPriceFilter = browser.findElement(APPLY_PRICE_FILTER);
        applyPriceFilter.click();

        List<WebElement> filteredHoodiesList = browser.findElements(HOODIES_FILTERED_LIST);

        for (WebElement we : filteredHoodiesList) {
        System.out.println(we.getText());
        }





    }
}
