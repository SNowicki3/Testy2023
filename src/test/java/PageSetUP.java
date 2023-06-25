import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSetUP {
    String projectlocation = System.getProperty("user.dir");
    ChromeDriver driver;
    @BeforeEach
    public void Start() {
        System.setProperty("webdriver.chrome.driver", projectlocation + "/Zasoby/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
    }

    @AfterEach
    public void TheEND(){
        driver.close();
    }
}








