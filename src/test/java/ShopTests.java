import org.junit.jupiter.api.Test;

public class ShopTests {
    @Test
    public void sportsDirectTest() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openURL("lv.sportsdirect.com");

        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
    }
}
