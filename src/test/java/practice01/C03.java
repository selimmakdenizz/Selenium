package practice01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class C03 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "src/resources/Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

    driver.manage().window().maximize();

        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");

        // ilk kutucuga 20 giriniz
       WebElement ilkKutucuk= driver.findElement(By.id("number1"));
       ilkKutucuk.sendKeys("20");
       Thread.sleep(3000);

       // ikinci kutucuga 30 giriniz
        WebElement ikinciKutucuk= driver.findElement(By.id("number2"));
        ikinciKutucuk.sendKeys("30");
        Thread.sleep(3000);


        // calculate'e tıklayınız

        WebElement calculate=driver.findElement(By.id("calculate"));
        calculate.click();
        Thread.sleep(3000);

       // calculate.sendKeys("calculate:"+ Keys.ENTER);

        // sonucu yazdırınız
        WebElement sonuc=driver.findElement(By.id("answer"));
        System.out.println("toplama isleminin sonucu:"+sonuc.getText());


        // sayfayi kapatiniz
        driver.close();






    }
}
