
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class UltimateQATEST extends PageSetUP{

@Test
public void TestONE () {
    WebElement button = driver.findElementById("idExample");
    button.click();

    WebElement text = driver.findElementByClassName("entry-title");
    Assertions.assertEquals("Button success",text.getText());


    }


}
