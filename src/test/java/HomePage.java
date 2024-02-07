import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class HomePage {
    private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void acceptCookies() {
        baseFunc.click(ACCEPT_COOKIES_BTN);
    }
}
