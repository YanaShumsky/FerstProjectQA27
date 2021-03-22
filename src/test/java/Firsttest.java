import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Firsttest {

    WebDriver wd;

    @Test
    public void startgoogle(){
        wd = new ChromeDriver();
        wd.get("https://www.google.co.il/");
    }

}
